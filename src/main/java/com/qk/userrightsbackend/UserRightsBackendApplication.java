package com.qk.userrightsbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qk.userrightsbackend.Mapper")
public class UserRightsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRightsBackendApplication.class, args);
    }

}
