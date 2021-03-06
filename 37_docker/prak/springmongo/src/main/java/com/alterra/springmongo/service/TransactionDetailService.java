package com.alterra.springmongo.service;

import java.util.List;

import com.alterra.springmongo.model.TransactionDetail;

public interface TransactionDetailService {
    TransactionDetail create(TransactionDetail transactionDetail);
    List<TransactionDetail> findAll();
    TransactionDetail findById(String id);
    TransactionDetail update(String id, TransactionDetail transactionDetail);
    void delete(String id);

}
