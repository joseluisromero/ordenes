package com.mecanica.ordenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdenesApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrdenesApplication.class, args);
        System.out.printf("Corriendo Servidor.....");
    }

}
