package com.vininavarini.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vininavarini.cursomc.domain.Categoria;
import com.vininavarini.cursomc.repositories.CetegoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CetegoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 =  new Categoria(null, "Informatica");
		Categoria cat2 =  new Categoria(null, "Escritorio");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
}
