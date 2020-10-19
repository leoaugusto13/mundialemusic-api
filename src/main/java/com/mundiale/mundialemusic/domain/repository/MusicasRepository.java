package com.mundiale.mundialemusic.domain.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.mundiale.mundialemusic.domain.model.Musicas;

public interface MusicasRepository extends JpaRepository<Musicas, Long> {

	Musicas findById(long id);
	}

	

