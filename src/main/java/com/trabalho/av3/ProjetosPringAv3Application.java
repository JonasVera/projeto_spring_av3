package com.trabalho.av3;

import java.text.SimpleDateFormat;import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabalho.av3.domain.Cartao;
import com.trabalho.av3.domain.Categoria;
import com.trabalho.av3.domain.Fatura;
import com.trabalho.av3.repositories.CartaoRepository;
import com.trabalho.av3.repositories.CategoriaRepository;
import com.trabalho.av3.repositories.FaturaRepository;

@SpringBootApplication
public class ProjetosPringAv3Application implements CommandLineRunner{
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	CartaoRepository cartaoRepository;
	@Autowired
	FaturaRepository faturaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetosPringAv3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		// CRIANDO CATEGORIA E SALVANDO AS CATEGORIAS
		Categoria cat1 = new Categoria(null,"Bronze");
		Categoria cat2 = new Categoria(null,"Silver");
		Categoria cat3 = new Categoria(null,"Gold"); 
		
		 //categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		// CRIANDO CARTÃO 
		  
		Date sdt = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
		Date dtVenc = dt.parse("20/02/2022");
		
		Cartao card1 = new Cartao(null,23343322,dtVenc,"JONAS SILVA VERA",874,"20718");
		Cartao card2 = new Cartao(null,23343322,dt.parse("30/02/2023"),"JOSE DA SILVA",684,"0000");
		Cartao card3 = new Cartao(null,23343322,dt.parse("30/02/2023"),"MARCOS SILVA",124,"0202");	
		 
		 
		Fatura fat1 = new Fatura();
		fat1.setCartao(card1);
		fat1.setDataVencimento(dt.parse("30/06/2020"));
		fat1.setEstado(true);
		fat1.setDataVencimento(dt.parse("31/06/2020"));
		fat1.setJuros(new Double(0));
		
		Fatura fat2 = new Fatura();
		fat1.setCartao(card1);
		fat1.setDataVencimento(null);
		fat1.setEstado(false);
		fat1.setDataVencimento(dt.parse("05/07/2020"));
		fat1.setJuros(new Double(0));
		

	 
		card1.getFaturas().add(fat2);
		 
		  
		cartaoRepository.saveAll(Arrays.asList(card1,card2,card3));
		faturaRepository.saveAll(Arrays.asList(fat1));
		  
		 
	}
}
