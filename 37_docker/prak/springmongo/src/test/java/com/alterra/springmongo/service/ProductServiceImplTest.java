package com.alterra.springmongo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.alterra.springmongo.model.Product;
import com.alterra.springmongo.repository.ProductRepository;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductServiceImplTest {
    private final EasyRandom EASY_RANDOM = new EasyRandom();
    private String id;
  
    @InjectMocks
    private ProductServiceImpl service;
    @Mock
    private ProductRepository repository;
  
    @BeforeEach
    public void setUp() {
      MockitoAnnotations.openMocks(this);
      id = EASY_RANDOM.nextObject(String.class);
    }

    @Test
    void getOne_WillReturnNull() {
        when(repository.findById(id)).thenReturn(Optional.empty());

        var result= service.findById(id);

        verify(repository, times(1)).findById(id);
        assertEquals(null, result);
    }

    @Test
    void getOne_WillReturnProduct() {
        Product product = EASY_RANDOM.nextObject(Product.class);
    
        when(repository.findById(product.getId())).thenReturn(Optional.of(product));

        var result = service.findById(product.getId());

        verify(repository, times(1)).findById(product.getId());
        assertEquals(product, result);
    }

    @Test
    public void getAll_WillReturnListProduct() {
        List<Product> product = EASY_RANDOM.objects(Product.class,2)
            .collect(Collectors.toList());
        when(repository.findAll()).thenReturn(product);

        var result = service.findAll();

        List<Product> outputs = new ArrayList<>();
        for (Product p: product) {
            outputs.add(p);
        }
        verify(repository, times(1)).findAll();
        assertEquals(product, result);
    }

    @Test
    void addOne_WillReturnProduct() {
        Product input = EASY_RANDOM.nextObject(Product.class);
        when(repository.save(input)).thenReturn(input);

        var result = service.create(input);
    
        verify(repository, times(1)).save(input);
    }

    @Test
    void deleteOne_WillDoNothing() {
        doNothing().when(repository).deleteById(id);

        service.delete(id);    
        verify(repository, times(1)).deleteById(id);
    }
}
