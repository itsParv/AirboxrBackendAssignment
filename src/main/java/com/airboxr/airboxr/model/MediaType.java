package com.airboxr.airboxr.model;

import javax.persistence.*;

@Entity
@Table(name = "`MediaType`")
public class MediaType {
	public MediaType() {}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "`MediaTypeId`")
	private int mediaTypeId;
	
	@Column(name = "`Name`")
	private int name;

	public MediaType(int mediaTypeId, int name) {
		this.mediaTypeId = mediaTypeId;
		this.name = name;
	}

	public int getMediaTypeId() {
		return mediaTypeId;
	}

	public void setMediaTypeId(int mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
}
