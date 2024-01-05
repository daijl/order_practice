package com.djl.dd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.djl.dd","com.djl.dd.mapper"})
public class DingdanApplication {
    public static void main(String[] args) {

            SpringApplication.run(DingdanApplication.class,args);

    }
}