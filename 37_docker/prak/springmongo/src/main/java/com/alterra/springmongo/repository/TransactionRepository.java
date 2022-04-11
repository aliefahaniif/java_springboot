package com.alterra.springmongo.repository;

import com.alterra.springmongo.model.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String>{
    
}
