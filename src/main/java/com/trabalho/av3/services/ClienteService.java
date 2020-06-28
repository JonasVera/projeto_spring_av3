package com.trabalho.av3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trabalho.av3.domain.Cliente;
import com.trabalho.av3.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;
 

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository repository; 
	
	public Cliente find(Integer id) throws ObjectNotFoundException {
 
		 
		java.util.Optional<Cliente> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException("\n\nObjeto não encontrad ! ID: "+id+ ", Tipo: \n\n"+Cliente.class+"\n\n"));
	}

}
