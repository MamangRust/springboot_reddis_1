package com.sanedge.spring_boot_redis.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sanedge.spring_boot_redis.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByExternalId(String extrnalId);

    List<Customer> findByAccountsId(Long id);
}
