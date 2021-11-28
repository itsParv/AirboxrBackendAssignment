package com.airboxr.airboxr.response.model;

import org.springframework.http.HttpStatus;

import com.airboxr.airboxr.model.Track;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetTrackByName {
	
	private HttpStatus status;
	private String error;
	private Track trackDetails;
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
	public Track getTrackDetails() {
		return trackDetails;
	}
	public void setTrackDetails(Track trackDetails) {
		this.trackDetails = trackDetails;
	}

}
