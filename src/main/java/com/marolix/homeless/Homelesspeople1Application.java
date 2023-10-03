package com.marolix.homeless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Homelesspeople1Application {

	public static void main(String[] args) {
		SpringApplication.run(Homelesspeople1Application.class, args);
	}

}
