package com.trabalho.av3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trabalho.av3.domain.Conta;
import com.trabalho.av3.repositories.ContaRepository;
 

@Service
public class ContaService {
	

	@Autowired
	private ContaRepository repository; 
	
	public Conta find(Integer id) {
 
		 
		java.util.Optional<Conta> obj = repository.findById(id);
		
		return obj.orElse(null);
	}

}
