package com.alterra.springmongo.service;

import java.util.List;

import com.alterra.springmongo.model.TransactionDetail;
import com.alterra.springmongo.repository.TransactionDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService{
    @Autowired
    private TransactionDetailRepository transactiondetailRepository;

    @Override
    public TransactionDetail create(TransactionDetail transactiondetail) {
        return transactiondetailRepository.save(transactiondetail);
    }

    @Override
    public List<TransactionDetail> findAll() {
        return transactiondetailRepository.findAll();
    }

    @Override
    public TransactionDetail findById(String id) {
       return transactiondetailRepository.findById(id).orElseThrow(()->{
           throw new Error("product with id"+id+"is not found");
        });
    }

    @Override
    public void delete(String id) {
        TransactionDetail transactiondetailById = this.findById(id);
        transactiondetailRepository.delete(transactiondetailById);
        
    }

    @Override
    public TransactionDetail update(String id, TransactionDetail transactiondetail) {
        TransactionDetail transactiondetailById = this.findById(id);

        transactiondetailById.setTransaction_id(transactiondetail.getTransaction_id());
        transactiondetailById.setProduct_id(transactiondetail.getProduct_id());
        transactiondetailById.setQuantity(transactiondetail.getQuantity());
        return transactiondetailRepository.save(transactiondetailById);
    }
    
}
