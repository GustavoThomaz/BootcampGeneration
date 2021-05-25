package com.helloworld.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
	
	@GetMapping("/rota")
	public  ResponseEntity<String> mentalidadeHabilidade () {
		return ResponseEntity.status(200).body("A mentalidade utilizada foi a orientação aos detalhes e a "
				+ "habilidade foi a de persistência");
	}
	@GetMapping("/rotadois")
	public ResponseEntity<String> objetivo () {
		return ResponseEntity.status(200).body("Meu objetivo é conseguir aprender e me desenvolver em spring boot e "
				+ "conseguir desenvolver minha habilidade de comunicação");
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		
	}
}
