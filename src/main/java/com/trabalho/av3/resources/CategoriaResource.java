package com.trabalho.av3.resources;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trabalho.av3.domain.Categoria;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

	
	@GetMapping
	public java.util.List<Categoria> listar() {
		 
		 Categoria cat1 = new Categoria(1,"Bronze");
		 Categoria cat2 = new Categoria(1,"Silver");
		 Categoria cat3 = new Categoria(1,"Gold");
		 
	     List<Categoria> categorias = new ArrayList<>();
	     categorias.add(cat1);
	     categorias.add(cat2);
	     categorias.add(cat3);
	     return categorias;
	}
	
}
