package com.airboxr.airboxr.model;

import javax.persistence.*;

@Entity
@Table(name = "`Playlist`")
public class Playlist {
	public Playlist() {}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "`PlaylistId`")
	private int playListId;
	
	@Column(name = "`Name`")
	private String name;

	public Playlist(int playListId, String name) {
		this.playListId = playListId;
		this.name = name;
	}

	public int getPlayListId() {
		return playListId;
	}

	public void setPlayListId(int playListId) {
		this.playListId = playListId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
