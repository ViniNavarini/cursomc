package com.vininavarini.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vininavarini.cursomc.domain.Categoria;
import com.vininavarini.cursomc.repositories.CategoriaRepository;
import com.vininavarini.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) 
	{
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
			
	}

	
	public Categoria insert(Categoria obj) {
	    obj.setId(null);
		return repo.save(obj);
	}
}
