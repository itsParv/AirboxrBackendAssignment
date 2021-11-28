package com.airboxr.airboxr.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airboxr.airboxr.model.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

	List<Playlist> findByName(String name);
}
