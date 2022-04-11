package com.alterra.springmongo.controller;

import java.util.List;

import com.alterra.springmongo.model.TransactionDetail;
import com.alterra.springmongo.service.TransactionDetailService;

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
@RequestMapping("/transactionsdetail")
public class TransactionDetailController {
    @Autowired
    private TransactionDetailService transactiondetailService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TransactionDetail transactiondetail){
        TransactionDetail transactiondetailCreated = transactiondetailService.create(transactiondetail);
        return ResponseEntity.ok(transactiondetailCreated);
    }

    @GetMapping
    public ResponseEntity<?> listTransactionDetail(){
        List<TransactionDetail> tdetail = transactiondetailService.findAll();
        return ResponseEntity.ok(tdetail);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> TransactionDetail(@PathVariable("id") String id){
       try{
            TransactionDetail tdetail = transactiondetailService.findById(id);
            return ResponseEntity.ok(tdetail);
       } catch(Exception e){
            InternalError internalError = new InternalError(e.getMessage());

            return ResponseEntity.internalServerError().body(internalError);
       }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody TransactionDetail transactiondetail){
        try{
            TransactionDetail tdetailUpdate = transactiondetailService.update(id, transactiondetail);
            return ResponseEntity.ok(tdetailUpdate);
       } catch(Exception e){
            InternalError internalError = new InternalError(e.getMessage());

            return ResponseEntity.internalServerError().body(internalError);
       }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        try{
            transactiondetailService.delete(id);
            return ResponseEntity.noContent().build();
       } catch(Exception e){
            InternalError internalError = new InternalError(e.getMessage());

            return ResponseEntity.internalServerError().body(internalError);
       }
    }
}
