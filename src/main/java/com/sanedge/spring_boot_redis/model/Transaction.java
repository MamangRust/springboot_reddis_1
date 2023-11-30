package com.sanedge.spring_boot_redis.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@RedisHash("transaction")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    private Long id;
    private int amount;
    private Date date;
    @Indexed
    private Long fromAccountId;
    @Indexed
    private Long toAccountId;
}