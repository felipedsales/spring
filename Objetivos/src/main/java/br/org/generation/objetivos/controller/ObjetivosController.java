package br.org.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class ObjetivosController {

	@GetMapping
	public String ObjetivosShow() {
		return "Meu Objetivo de aprendizagem é dominar o SpringBoot";
	}
}
