package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")//localhost:8080/hello
public class HelloWordController {
	@GetMapping
	public String helloShow() {
		return "Usei habilidade de pedir ajuda , e minha mentalidade foi a de Persistencia";
	}
	@GetMapping("/lin")//localhost:8080/hello/lin
	public String linShow() {
		return "Meu Principal Objetivo Essa Semana é entender mais sobre SpringBoot";
	}
	@GetMapping("/entendi")//localhost:8080/hello/entendi
	public String entendiShow() {
		return "Entendi , Show!";
	}
}
