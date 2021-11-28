package com.airboxr.airboxr.model;

import javax.persistence.*;

@Entity
@Table(name = "`PlaylistTrack`")
public class PlaylistTrack {
	public PlaylistTrack() {}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "`PlaylistId`")
	private int playlistId;
	
	@Column(name = "`TrackId`")
	private int trackId;

	public PlaylistTrack(int playlistId, int trackId) {
		this.playlistId = playlistId;
		this.trackId = trackId;
	}

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}


}
