package com.helloword.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsmController {

	@GetMapping
	public String showBSM() {
		return "Lista de BSM’s da Generation Brasil:<br>"
				+ "<br>- Orientação ao Futuro <br>- Responsabilidade Pessoal <br>- Mentalidade de Crescimento <br>- Persistência"
				+ "<br>- Trabalho em Equipe <br>- Atenção aos Detalhes <br>- Proatividade <br>- Comunicação ";
	}
}