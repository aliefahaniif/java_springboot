package com.alterra.springmongo.controller;

import java.util.List;

import com.alterra.springmongo.model.Transaction;
import com.alterra.springmongo.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService customerService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Transaction customer){
        Transaction customerCreated = customerService.create(customer);
        return ResponseEntity.ok(customerCreated);
    }

    @GetMapping
    public ResponseEntity<?> listCustomer(){
        List<Transaction> customer = customerService.findAll();
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> customer(@PathVariable("id") String id){
       try{
            Transaction customer = customerService.findById(id);
            return ResponseEntity.ok(customer);
       } catch(Exception e){
            InternalError internalError = new InternalError(e.getMessage());

            return ResponseEntity.internalServerError().body(internalError);
       }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Transaction customer){
        try{
            Transaction customerUpdate = customerService.update(id, customer);
            return ResponseEntity.ok(customerUpdate);
       } catch(Exception e){
            InternalError internalError = new InternalError(e.getMessage());

            return ResponseEntity.internalServerError().body(internalError);
       }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        try{
            customerService.delete(id);
            return ResponseEntity.noContent().build();
       } catch(Exception e){
            InternalError internalError = new InternalError(e.getMessage());

            return ResponseEntity.internalServerError().body(internalError);
       }
    }
}
