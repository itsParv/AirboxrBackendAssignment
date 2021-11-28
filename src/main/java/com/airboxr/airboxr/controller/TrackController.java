package com.airboxr.airboxr.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airboxr.airboxr.jpa.PlaylistRepository;
import com.airboxr.airboxr.jpa.PlaylistTrackRepository;
import com.airboxr.airboxr.jpa.TrackRepository;
import com.airboxr.airboxr.model.Playlist;
import com.airboxr.airboxr.model.PlaylistTrack;
import com.airboxr.airboxr.model.Track;
import com.airboxr.airboxr.response.model.GetCountByPlaylistName;
import com.airboxr.airboxr.response.model.GetPlaylistTrackEntity;
import com.airboxr.airboxr.response.model.GetTrackByName;

@RestController
@RequestMapping("/track")
public class TrackController {
	
	@Autowired
	TrackRepository trackRepo;
	
	@Autowired
	PlaylistRepository playlistRepo;
	
	@Autowired
	PlaylistTrackRepository playlistTrackRepo;
	
	@GetMapping("")
	public GetTrackByName getTrackByName(@RequestParam String trackName) {

		GetTrackByName getTrackDetails = new GetTrackByName();
		if(StringUtils.hasLength(trackName)) {
			getTrackDetails.setStatus(HttpStatus.BAD_REQUEST);
			getTrackDetails.setError("Invalid value passed for trackName");
			getTrackDetails.setTrackDetails(null);
		}
		Track track = trackRepo.findByName(trackName);
		if(track == null || ObjectUtils.isEmpty(track)) {			
			getTrackDetails.setStatus(HttpStatus.NOT_FOUND);
			getTrackDetails.setError("No Result Found");
			getTrackDetails.setTrackDetails(track);
		} else {
			getTrackDetails.setStatus(HttpStatus.OK);
			getTrackDetails.setError(null);
			getTrackDetails.setTrackDetails(track);
		}
		
		return getTrackDetails;
	}
	
	@GetMapping("/playlist")
	public GetPlaylistTrackEntity getPlaylistTrackByPlaylistNameAndTrackName(@RequestParam String playlistName, @RequestParam String trackName) {
		
		GetPlaylistTrackEntity playlistTrack = new GetPlaylistTrackEntity();
		
		if(!StringUtils.hasLength(trackName) || !StringUtils.hasLength(playlistName)) {
			playlistTrack.setStatus(HttpStatus.BAD_REQUEST);
			playlistTrack.setError("Invalid value(s) passed as paramenter");
			playlistTrack.setPlaylistTrackDetails(null);	
			return playlistTrack;
		}
		
		Track track = trackRepo.findByName(trackName);
		List<Playlist> playlist = playlistRepo.findByName(playlistName);
		List<Integer> playlistId =  playlist.stream().map(p -> p.getPlayListId()).collect(Collectors.toList());
		
		if(ObjectUtils.isEmpty(track) || track == null || ObjectUtils.isEmpty(playlistId) || playlistId == null) {
			playlistTrack.setStatus(HttpStatus.NOT_FOUND);
			playlistTrack.setError("Invalid value(s) passed as paramenter");
			playlistTrack.setPlaylistTrackDetails(null);	
			return playlistTrack;
		}
		
		List<PlaylistTrack> playlistTrackDetails = playlistTrackRepo.findByPlaylistIdInAndTrackId(playlistId, track.getTrackId());
		
		if(playlistTrackDetails.isEmpty()) {
			playlistTrack.setStatus(HttpStatus.NOT_FOUND);
			playlistTrack.setError("No Record Found");
			playlistTrack.setPlaylistTrackDetails(null);	
			return playlistTrack;
		} else {
			playlistTrack.setStatus(HttpStatus.OK);
			playlistTrack.setError(null);
			playlistTrack.setPlaylistTrackDetails(playlistTrackDetails);	
			return playlistTrack;
		}
		
		
	}
	
	@GetMapping("/count")
	public GetCountByPlaylistName getTrackCountByPlaylistName(@RequestParam String playlistName) {
		
		GetCountByPlaylistName getCount = new GetCountByPlaylistName();
		
		if(!StringUtils.hasLength(playlistName)) {
			getCount.setStatus(HttpStatus.BAD_REQUEST);
			getCount.setMessage("Invalid value passed as parameter");
			getCount.setCount(0);
			return getCount;
		}
		
		List<Playlist> playlist = playlistRepo.findByName(playlistName);
		List<Integer> playlistId =  playlist.stream().map(p -> p.getPlayListId()).collect(Collectors.toList());
		
		Long count = playlistTrackRepo.countByPlaylistIdIn(playlistId);
		if(count <= 0) {
			getCount.setStatus(HttpStatus.NOT_FOUND);
			getCount.setMessage("No record found for this value");
		} else {
			getCount.setStatus(HttpStatus.OK);
			getCount.setMessage(null);
		}
		getCount.setCount(count);
		return getCount;
	}

}
