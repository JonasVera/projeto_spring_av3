package com.trabalho.av3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.av3.domain.Cartao;
import com.trabalho.av3.domain.Categoria;
import com.trabalho.av3.repositories.CartaoRepository;
import com.trabalho.av3.repositories.CategoriaRepository;

@Service
public class CartaoService {
	

	@Autowired
	private CartaoRepository repository; 
	
	public Cartao find(Integer id) {
 
		 
		java.util.Optional<Cartao> obj = repository.findById(id);
		
		return obj.orElse(null);
	}

}
