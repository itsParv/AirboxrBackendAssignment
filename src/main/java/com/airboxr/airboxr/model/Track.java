package com.airboxr.airboxr.model;

import javax.persistence.*;

@Entity
@Table(name = "`Track`")
public class Track {
	public Track(){}
	public Track(int trackId, String name,int albumId, int mediaTypeId, int genreId, String composer, int milliseconds, int bytes,
			int unitPrice) {
		super();
		this.trackId = trackId;
		this.name = name;
		this.albumId = albumId;
		this.mediaTypeId = mediaTypeId;
		this.genreId = genreId;
		this.composer = composer;
		this.milliseconds = milliseconds;
		this.bytes = bytes;
		this.unitPrice = unitPrice;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "`TrackId`")
	private int trackId;
	
	@Column(name = "`Name`")
	private String name;
	
	@Column(name = "`MediaTypeId`")
	private int mediaTypeId;
	
	@Column(name = "`GenreId`")
	private int genreId;
	
	@Column(name = "`Composer`")
	private String composer;
	
	@Column(name = "`Milliseconds`")
	private int milliseconds;
	
	@Column(name = "`Bytes`")
	private int bytes;
	
	@Column(name = "`UnitPrice`")
	private double unitPrice;
	
	@Column(name = "`AlbumId`")
	private int albumId;

	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMediaTypeId() {
		return mediaTypeId;
	}

	public void setMediaTypeId(int mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(int milliseconds) {
		this.milliseconds = milliseconds;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	

}
