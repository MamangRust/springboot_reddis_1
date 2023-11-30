package com.sanedge.spring_boot_redis.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RedisHash("customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    private Long id;
    @Indexed
    private String externalId;
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(Long id, String externalId, String name) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
