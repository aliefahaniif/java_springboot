package com.alterra.springmongo.service;

import java.util.List;

import com.alterra.springmongo.model.Transaction;
import com.alterra.springmongo.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction create(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findById(String id) {
       return transactionRepository.findById(id).orElseThrow(()->{
           throw new Error("product with id"+id+"is not found");
        });
    }

    @Override
    public void delete(String id) {
        Transaction transactionById = this.findById(id);
        transactionRepository.delete(transactionById);
        
    }

    @Override
    public Transaction update(String id, Transaction transaction) {
        Transaction transactionById = this.findById(id);

        transactionById.setCustomer_name(transaction.getCustomer_name());
        transactionById.setTransaction_details(transaction.getTransaction_details());
        transactionById.setIs_paid(transaction.getIs_paid());
        transactionById.setCreated_at(transaction.getCreated_at());
        return transactionRepository.save(transactionById);
    }
    
}
