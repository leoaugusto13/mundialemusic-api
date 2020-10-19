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

import com.mundiale.mundialemusic.domain.model.Playlist;
import com.mundiale.mundialemusic.domain.repository.PlaylistRespository;

@RestController
@RequestMapping("/api")
public class PlaylistController {

	@Autowired
	private PlaylistRespository playlistRepository;
	
	@GetMapping("/playlists")
	public List<Playlist> listarPlaylist() {
		return playlistRepository.findAll();
		
	}
	
	@GetMapping("/playlist/{id}")
	public Playlist listaUsuarioPorId(@PathVariable(value="id") long id) {
		return playlistRepository.findById(id);
		
	}
	
	@PostMapping("/playlists")
	public Playlist salvaUsuarios(@RequestBody Playlist playlist) {
		return playlistRepository.save(playlist);
	}
	
	@DeleteMapping("/playlists")
	public void deletaUsuarios(@RequestBody Playlist playlist) {
		playlistRepository.delete(playlist);
	}
	
	@PutMapping("/playlists")
	public Playlist atualizaUsuario(@RequestBody Playlist playlist) {
		return playlistRepository.save(playlist);
	}
}
