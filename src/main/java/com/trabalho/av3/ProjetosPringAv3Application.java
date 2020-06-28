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
import com.trabalho.av3.domain.Cliente;
import com.trabalho.av3.domain.Endereco;
import com.trabalho.av3.domain.Fatura;
import com.trabalho.av3.repositories.CartaoRepository;
import com.trabalho.av3.repositories.CategoriaRepository;
import com.trabalho.av3.repositories.ClienteRepository;
import com.trabalho.av3.repositories.FaturaRepository;

@SpringBootApplication
public class ProjetosPringAv3Application implements CommandLineRunner{
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	CartaoRepository cartaoRepository;
	@Autowired
	FaturaRepository faturaRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	com.trabalho.av3.repositories.EnderecoRepository enderecoRepository;
	
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
		  
	 
		SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
		Date dtVenc = dt.parse("20/02/2022");
		
		///Cartao card1 = new Cartao(null,23343322,dtVenc,"JONAS SILVA VERA",874,"20718");
		//Cartao card2 = new Cartao(null,23343322,dt.parse("30/02/2023"),"JOSE DA SILVA",684,"0000");
	//	// card3 = new Cartao(null,23343322,dt.parse("30/02/2023"),"MARCOS SILVA",124,"0202");	
		 
		
		// CRIAÇÃO DAS FATURAS 
		Fatura fat1 = new Fatura();
	//	fat1.setCartao(card1);
		fat1.setDataVencimento(dt.parse("30/06/2020"));
		fat1.setEstado(true);
		fat1.setDataVencimento(dt.parse("31/06/2020"));
		fat1.setJuros(new Double(0));
		
		Fatura fat2 = new Fatura();
		//.setCartao(card1);
		fat1.setDataVencimento(null);
		fat1.setEstado(false);
		fat1.setDataVencimento(dt.parse("05/07/2020"));
		fat1.setJuros(new Double(0));
		
	//	card1.getFaturas().addAll(Arrays.asList(fat1));

		//cartaoRepository.saveAll(Arrays.asList(card1,card2,card3));
		//faturaRepository.saveAll(Arrays.asList(fat1));
		
		//CRIACAO DO CLIENTE 
  
		Cliente cli1 = new Cliente(null,"Jonas@gmail.com","JONAS SILVA VERA","(85)0000-000");
		Cliente cli2 = new Cliente(null,"JOSE DA SILVA","(85)0000-000","Jose@gmail.com");
		Cliente cli3 = new Cliente(null,"MARCOS SILVA","(85)0000-000","Marcos@gmail.com");
		
	   // CRIAÇÃO DOS ENDEREÇOS
		  
		Endereco end1 = new Endereco(null,"Rua JOAO BATISTA","875","DIADEMA","HORIZONTE","CE",cli1);
		Endereco end2 = new Endereco(null,"Rua JOSE SABINO","572","PLANALTO","HORIZONTE","CE",cli2);
		Endereco end3 = new Endereco(null,"Rua 13 DE MAIO","875","CENTRO","FORTALEZA","CE",cli3);
		
	    cli1.getEnderecos().addAll(Arrays.asList(end1));
	    cli2.getEnderecos().addAll(Arrays.asList(end2));
	    cli3.getEnderecos().addAll(Arrays.asList(end3));
	    
	    //clienteRepository.saveAll( Arrays.asList(cli1,cli2,cli3));
		
	    //enderecoRepository.saveAll( Arrays.asList(end1,end2,end3));
		
	    
	}
}
