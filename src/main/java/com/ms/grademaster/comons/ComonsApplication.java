package com.ms.grademaster.comons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ms.grademaster")
@EnableJpaRepositories
@EntityScan(basePackages = "com.ms.grademaster")
public class ComonsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComonsApplication.class, args);
    }
}
