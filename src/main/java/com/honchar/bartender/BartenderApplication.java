package com.honchar.bartender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BartenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BartenderApplication.class, args);
	}

}
