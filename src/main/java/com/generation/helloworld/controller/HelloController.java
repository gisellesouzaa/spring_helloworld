package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

		@GetMapping
		public String hello() {
			return "<h1><i>Hello  World! <br/><br/> Aqui é a Giselle Souza <i/></h1>";
		}

		@GetMapping("/bsm")
		public String listaBsm() {
			return "<h2>Lista de BSM - Generation Brasil: </h2><h3><li>Responsabilidade pessoal</li><li>Mentalidade de Crescimento</li><li>Orientação ao Futuro</li><li>Persistência</li></h3>";	
		}
		
		@GetMapping("/objetivos")
		public String objetivosAprendizagem() {
			return "<h2>Objetivos de Aprendizagem: </h2><h3> Meu objetivo de aprendizagem dessa semana é: <u>Mentalidade de Crescimento</u>.</h3>";	
		}
		
		@GetMapping("/sobre")
		public String sobre() {
			return "<h2>Eu sou a Giselle Souza, estudante de programação. </br></br> Se quiser ver os meus projetos e me conhecer melhor, acesse: </br></br> <a>www.linkedin.com/in/giselle-de-souza-gabriel </a></h2>";	
		}
		
}
