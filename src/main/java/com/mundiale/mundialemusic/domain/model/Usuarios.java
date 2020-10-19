package com.mundiale.mundialemusic.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome_usuario")
	private String nome;
	
	@Column(name = "email_usuario")
	private String email;
	
	@Column(name = "senha_usuario")
	private String senha;
	
	
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@ManyToOne
	private Playlist playlist;
	
	
}
