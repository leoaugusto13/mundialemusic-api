package com.mundiale.mundialemusic.domain.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.mundiale.mundialemusic.domain.model.Artistas;



public interface ArtistasRepository extends JpaRepository<Artistas, Long>{
	
	Artistas findById(long id); 

	}
