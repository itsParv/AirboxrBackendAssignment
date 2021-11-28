package com.airboxr.airboxr.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airboxr.airboxr.model.PlaylistTrack;



public interface PlaylistTrackRepository extends JpaRepository<PlaylistTrack, Integer>{
	
	List<PlaylistTrack> findByPlaylistIdInAndTrackId(List<Integer> playlistId, int trackId);

	Long countByPlaylistIdIn(List<Integer> playlistId);
}
