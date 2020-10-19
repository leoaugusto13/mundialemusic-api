package com.mundiale.mundialemusic.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mundiale.mundialemusic.domain.model.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{
	
	Usuarios findById(long id); 

}
