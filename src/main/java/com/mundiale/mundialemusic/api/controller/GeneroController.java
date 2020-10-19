package com.mundiale.mundialemusic.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.mundiale.mundialemusic.domain.model.Genero;
import com.mundiale.mundialemusic.domain.repository.GeneroRepository;


@RestController
@RequestMapping("/api")
public class GeneroController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/generos")
	public List<Genero> listarGeneros() {
		return generoRepository.findAll();
		
	}
	
	@GetMapping("/genero/{id}")
	public Genero listaProdutoPorId(@PathVariable(value="id") long id) {
		return generoRepository.findById(id);
		
	}
	
	@PostMapping("/generos")
	public Genero salvaGenero(@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
	
	@DeleteMapping("/generos")
	public void deletaGenero(@RequestBody Genero genero) {
		generoRepository.delete(genero);
	}
	
	@PutMapping("/generos")
	public Genero atualizaGenero(@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
			
}

