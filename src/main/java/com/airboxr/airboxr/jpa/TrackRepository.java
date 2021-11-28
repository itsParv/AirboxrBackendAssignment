package com.airboxr.airboxr.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airboxr.airboxr.model.Track;

@Repository
public interface TrackRepository extends JpaRepository<Track, Integer>{
	
	Track findByName(String name);
	
}
