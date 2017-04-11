package com.pk.domaincheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
public class DomaincheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomaincheckApplication.class, args);
	}
}
