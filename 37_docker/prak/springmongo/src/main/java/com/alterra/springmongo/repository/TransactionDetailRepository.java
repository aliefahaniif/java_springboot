package com.alterra.springmongo.repository;

import com.alterra.springmongo.model.TransactionDetail;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailRepository extends MongoRepository<TransactionDetail, String>{
    
}
