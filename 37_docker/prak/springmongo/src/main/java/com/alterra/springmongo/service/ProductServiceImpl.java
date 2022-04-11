package com.alterra.springmongo.service;

import java.util.List;

import com.alterra.springmongo.model.Product;
import com.alterra.springmongo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
       return productRepository.findById(id).orElse(null);
      
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
        
    }

    @Override
    public Product update(String id, Product product) {
        Product productById = this.findById(id);

        productById.setName(product.getName());
        productById.setPrice(product.getPrice());
        return productRepository.save(productById);
    }
    
}
