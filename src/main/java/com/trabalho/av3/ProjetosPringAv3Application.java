package com.trabalho.av3;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabalho.av3.domain.Categoria;
import com.trabalho.av3.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetosPringAv3Application implements CommandLineRunner{
	@Autowired
	CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetosPringAv3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		// CRIANDO CATEGORIA
		Categoria cat1 = new Categoria(null,"Bronze");
		Categoria cat2 = new Categoria(null,"Silver");
		Categoria cat3 = new Categoria(null,"Gold");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	}

}
