package com.airboxr.airboxr.response.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.airboxr.airboxr.model.PlaylistTrack;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetPlaylistTrackEntity {
	
	private HttpStatus status;
	private String error;
	private List<PlaylistTrack> playlistTrackDetails;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<PlaylistTrack> getPlaylistTrackDetails() {
		return playlistTrackDetails;
	}
	public void setPlaylistTrackDetails(List<PlaylistTrack> playlistTrackDetails) {
		this.playlistTrackDetails = playlistTrackDetails;
	}

}
