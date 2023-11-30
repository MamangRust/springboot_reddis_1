package com.sanedge.spring_boot_redis.model;

import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    @Indexed
    private Long id;
    private String number;
    private int balance;
}
