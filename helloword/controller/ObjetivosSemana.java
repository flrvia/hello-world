package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivosSemana {

	@GetMapping
	public String objetivoSemana() {
		return "Objetivos de aprendizagem desta semana:<br>"
				+ "<br>1. Banco de dados com MySQL"
				+ "<br>2. Desenvolvimento Web com Java e Spring Boot"
				+ "<br>3. Arquitetura MVC"
				+ "<br>4. JSON"
				+ "<br>5. API REST"
				+ "<br>6. Testar no Postman";
	}
}