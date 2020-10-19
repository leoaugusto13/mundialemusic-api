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


import com.mundiale.mundialemusic.domain.model.Musicas;
import com.mundiale.mundialemusic.domain.repository.MusicasRepository;

@RestController
@RequestMapping("/api")
public class MusicasController {

	@Autowired
	private MusicasRepository musicasRepository;
	
	@GetMapping("/musicas")
	public List<Musicas> listarMusicas() {
		return musicasRepository.findAll();
		
	}
	
	@GetMapping("/musica/{id}")
	public Musicas listaMusicaPorId(@PathVariable(value="id") long id) {
		return musicasRepository.findById(id);
		
	}
	
	@PostMapping("/musicas")
	public Musicas salvaMusicas(@RequestBody Musicas musica) {
		return musicasRepository.save(musica);
	}
	
	@DeleteMapping("/musicas")
	public void deletaMusicas(@RequestBody Musicas musica) {
		musicasRepository.delete(musica);
	}
	
	@PutMapping("/musicas")
	public Musicas atualizaMusica(@RequestBody Musicas musica) {
		return musicasRepository.save(musica);
	}
}
