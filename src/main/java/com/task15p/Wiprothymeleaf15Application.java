package com.task15p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.task15p")
@EnableJpaRepositories(basePackages = "com.task15p.repository")
@EntityScan(basePackages = "com.task15p.entity")
public class Wiprothymeleaf15Application {

	public static void main(String[] args) {
		SpringApplication.run(Wiprothymeleaf15Application.class, args);
	}
}

//http://localhost:8080/clients