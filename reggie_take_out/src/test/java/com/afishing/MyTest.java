package com.afishing;

import com.afishing.reggie.ReggieApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


@SpringBootTest(classes = ReggieApplication.class)
public class MyTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void testHello() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("city","wuhan");
    }

    @Test
    void testHash(){
        HashOperations hashOperations = redisTemplate.opsForHash();
        String city = (String) hashOperations.get("001", "city");
        System.out.println(city);
    }

}