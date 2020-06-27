package com.trabalho.av3.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cartao")
public class CartaoResource {

	
	@GetMapping
	public String listar() {
		 return "REST FUNCIONADO !!";
	}
	
}
