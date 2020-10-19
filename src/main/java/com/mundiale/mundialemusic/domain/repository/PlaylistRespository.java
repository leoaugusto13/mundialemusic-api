package com.mundiale.mundialemusic.domain.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.mundiale.mundialemusic.domain.model.Playlist;

public interface PlaylistRespository extends JpaRepository<Playlist, Long>{
			
			Playlist findById(long id); 
}
