package com.vininavarini.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vininavarini.cursomc.domain.Categoria;
import com.vininavarini.cursomc.repositories.CetegoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CetegoriaRepository repo;
	
	public Categoria buscar(Integer id) 
	{
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
