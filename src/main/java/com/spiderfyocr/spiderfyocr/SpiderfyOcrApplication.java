package com.spiderfyocr.spiderfyocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spiderfyocr.*"})
public class SpiderfyOcrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderfyOcrApplication.class, args);
    }

}
