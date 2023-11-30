package com.sanedge.spring_boot_redis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanedge.spring_boot_redis.model.Transaction;
import com.sanedge.spring_boot_redis.repository.TransactionRepository;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    TransactionRepository transactionRepository;

    @PostMapping
    public Transaction add(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @GetMapping("/{id}")
    public Transaction findById(Long id) {
        Optional<Transaction> optTransaction = transactionRepository.findById(id);
        return optTransaction.orElse(null);
    }

    @GetMapping("/from/{accountId}")
    public List<Transaction> findByFromAccountId(Long accountId) {
        return transactionRepository.findByFromAccountId(accountId);
    }

    @GetMapping("/to/{accountId}")
    public List<Transaction> findByToAccountId(Long accountId) {
        return transactionRepository.findByToAccountId(accountId);
    }
}
