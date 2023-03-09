package com.example.amc_annuaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AmcAnnuaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmcAnnuaireApplication.class, args);
    }

}
