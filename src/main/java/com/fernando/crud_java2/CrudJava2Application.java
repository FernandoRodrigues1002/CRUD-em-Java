package com.fernando.crud_java2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudJava2Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudJava2Application.class, args);
		
	}

	public void run(String... args) {
		System.out.println("🚀  Aplicação CRUD em Java com Spring Boot está rodando na porta 8080! 🚀");
		System.out.println("Acesse: http://localhost:8080/api/pessoas");
	}

}
