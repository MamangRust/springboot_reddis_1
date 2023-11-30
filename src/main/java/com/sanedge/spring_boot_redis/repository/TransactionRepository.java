package com.sanedge.spring_boot_redis.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sanedge.spring_boot_redis.model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    List<Transaction> findByFromAccountId(Long fromAccountId);

    List<Transaction> findByToAccountId(Long toAccountId);

}