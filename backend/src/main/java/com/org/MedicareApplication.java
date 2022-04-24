package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.org")
public class MedicareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareApplication.class, args);
	}

}
