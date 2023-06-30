package com.afishing;

import com.afishing.reggie.ReggieApplication;
import com.afishing.reggie.entity.Employee;
import com.afishing.reggie.mapper.EmployeeMapper;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Security;
import java.util.Date;
import java.util.function.Function;

@SpringBootTest(classes = ReggieApplication.class)
public class MyTest {
    @Value("${reggie.path}")
    private String basePath;

    @Test
    void testHello(){
        System.out.println("hello");
    }

    @Test
    void test2(){
        System.out.println();
    }

    @Test
    void test03(){
        System.out.println(basePath);

    }

}