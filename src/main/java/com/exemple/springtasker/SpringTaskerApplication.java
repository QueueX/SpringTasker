package com.exemple.springtasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTaskerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTaskerApplication.class, args);
        System.out.println("Application started!");
    }

}
