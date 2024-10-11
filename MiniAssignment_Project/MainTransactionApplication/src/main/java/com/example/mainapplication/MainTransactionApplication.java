package com.example.mainapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MainTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainTransactionApplication.class, args);
	}
	
	 @Bean
	 public WebClient.Builder webClientBuilder() {
	        return WebClient.builder();
	    }

}
