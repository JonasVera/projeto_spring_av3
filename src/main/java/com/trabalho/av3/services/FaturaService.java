package com.trabalho.av3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.av3.domain.Fatura; 
import com.trabalho.av3.repositories.FaturaRepository;

@Service
public class FaturaService {
	@Autowired
	private FaturaRepository repository; 
	
	public Fatura find(Integer id) {
 
		 
		java.util.Optional<Fatura> obj = repository.findById(id);
		
		return obj.orElse(null);
	}
}
