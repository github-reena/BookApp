package com.example.BooksApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.BooksApplication.service.impl.BooksApplicationService;

@SpringBootApplication
public class BooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	
	@Bean
	public BooksApplicationService bookBean(){
		return new BooksApplicationService();
	}

}
