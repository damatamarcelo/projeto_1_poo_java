package com.webapp.webApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}

	@GetMapping("/poo")
	public String poo(@RequestParam(value = "name", defaultValue = "POO Java") String name) {
		return String.format("Bem vindo à disciplina de %s!", name);
	}

}
