package br.org.generation.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {

	@GetMapping
	public String HelloWorldShow() {
		return "Hello Família 36 !! Eu utilizei a habilidade de Atenção aos Detalhes e eu também utilizei as mentalidades de Persistência e Mentalidade de Crescimento";
		
	}
}
