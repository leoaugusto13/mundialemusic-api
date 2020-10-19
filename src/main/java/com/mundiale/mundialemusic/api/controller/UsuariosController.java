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

import com.mundiale.mundialemusic.domain.model.Usuarios;
import com.mundiale.mundialemusic.domain.repository.UsuariosRepository;


@RestController
@RequestMapping("/api")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@GetMapping("/usuarios")
	public List<Usuarios> listarUsuarios() {
		return usuariosRepository.findAll();
		
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuarios listaUsuarioPorId(@PathVariable(value="id") long id) {
		return usuariosRepository.findById(id);
		
	}
	
	@PostMapping("/usuarios")
	public Usuarios salvaUsuarios(@RequestBody Usuarios usuario) {
		return usuariosRepository.save(usuario);
	}
	
	@DeleteMapping("/usuarios")
	public void deletaUsuarios(@RequestBody Usuarios usuario) {
		usuariosRepository.delete(usuario);
	}
	
	@PutMapping("/usuarios")
	public Usuarios atualizaUsuario(@RequestBody Usuarios usuario) {
		return usuariosRepository.save(usuario);
	}
	
}
