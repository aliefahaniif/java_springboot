package com.alterra.springmongo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.alterra.springmongo.repository.ProductRepository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
@AutoConfigureMockMvc
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private ProductController productController;

    @Test
    public void getAllProducts() throws Exception {
        RequestBuilder requestBuilder =  MockMvcRequestBuilders
        .get("/products")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc
        .perform(requestBuilder)
        .andReturn();

        assertEquals(200, response.getResponse().getStatus());
    }

    @Test
    public void postCreateProductsWithPayload() throws Exception {
        JSONObject payload = new JSONObject();

        payload.put("name","Novel");
        payload.put("price", 210000);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
        .post("/products")
        .contentType(MediaType.APPLICATION_JSON)
        .content(payload.toJSONString())
        .accept(MediaType.APPLICATION_JSON);
        
        MvcResult response = mockMvc
        .perform(requestBuilder)
        .andReturn();

        assertEquals(200, response.getResponse().getStatus());
    }

    @Test
    public void postCreateProductsWithoutPayload() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders
        .post("/products")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON);
        
        MvcResult response = mockMvc
        .perform(requestBuilder)
        .andReturn();

        assertEquals(400, response.getResponse().getStatus());
    }

    @Test
    public void deleteProducts() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders
        .delete("/products/1")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON);
        
        MvcResult response = mockMvc
        .perform(requestBuilder)
        .andReturn();

        assertEquals(200, response.getResponse().getStatus());
    }
}
