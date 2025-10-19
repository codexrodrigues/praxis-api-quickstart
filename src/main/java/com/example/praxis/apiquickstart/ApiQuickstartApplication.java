package com.example.praxis.apiquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.praxis.apiquickstart"})
@EntityScan(basePackages = {"com.example.praxis.apiquickstart"})
public class ApiQuickstartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiQuickstartApplication.class, args);
    }
}

