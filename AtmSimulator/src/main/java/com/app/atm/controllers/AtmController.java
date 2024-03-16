package com.app.atm.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;


//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/atm")
public class AtmController {

	
	public AtmController() {
		System.out.println("inside AtmController");
	}
	
	@GetMapping("/hello")
	public String getatm() {
		
		System.out.println("inside getatm method");
		return "atm1";
	}
}
