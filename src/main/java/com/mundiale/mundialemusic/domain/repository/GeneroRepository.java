package com.mundiale.mundialemusic.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mundiale.mundialemusic.domain.model.Genero;


public interface GeneroRepository extends JpaRepository<Genero, Long>{
	
	Genero findById(long id);

}
