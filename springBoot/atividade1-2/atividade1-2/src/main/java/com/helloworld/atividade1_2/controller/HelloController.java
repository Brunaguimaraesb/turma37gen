package com.helloworld.atividade1_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping 
	
public class HelloController { 

	@GetMapping
	public String hello() {
		return "Hello Generation!!!";
	}
	
	@GetMapping   ("/atividade1")
	public String atividade1() { 
		return "Habilidades: Atenção aos detalhes, determinação, força de vontade e resiliência. \nMentalidades: Mentalidade de crescimento e persistência." ;  
	}  
   
	@GetMapping   ("/atividade2")  
	public String atividade2() { 
		return "O objetivo de aprendizagem é desenvolver spring boot." ;  
		}  
}

