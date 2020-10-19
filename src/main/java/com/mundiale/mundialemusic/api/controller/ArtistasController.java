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

import com.mundiale.mundialemusic.domain.model.Artistas;
import com.mundiale.mundialemusic.domain.repository.ArtistasRepository;




@RestController
@RequestMapping("/api")
public class ArtistasController {


	@Autowired
	private ArtistasRepository artistaRepository;
	
	@GetMapping("/artistas")
	public List<Artistas> listarArtistas() {
		return artistaRepository.findAll();
		
	}
	
	@GetMapping("/artista/{id}")
	public Artistas listaArtistaPorId(@PathVariable(value="id") long id) {
		return artistaRepository.findById(id);
		
	}
	
	@PostMapping("/artistas")
	public Artistas salvaArtista(@RequestBody Artistas artista) {
		return artistaRepository.save(artista);
	}
	
	@DeleteMapping("/artistas")
	public void deletaArtista(@RequestBody Artistas artista) {
		artistaRepository.delete(artista);
	}
	
	@PutMapping("/artistas")
	public Artistas atualizaArtista(@RequestBody Artistas artista) {
		return artistaRepository.save(artista);
	}
}
