package com.sanedge.spring_boot_redis.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanedge.spring_boot_redis.model.Customer;
import com.sanedge.spring_boot_redis.repository.CustomerRepository;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping
    public Customer add(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {
        Optional<Customer> optCustomer = customerRepository.findById(id);

        return optCustomer.orElse(null);
    }
}
