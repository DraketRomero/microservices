package com.pruebatecnica.pruebatecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PruebatecnicaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PruebatecnicaApplication.class, args);
    }
}
