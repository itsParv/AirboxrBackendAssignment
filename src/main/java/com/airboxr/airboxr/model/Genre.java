package com.airboxr.airboxr.model;

import javax.persistence.*;

@Entity
@Table(name = "`Genre`")
public class Genre {
	public Genre() {}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "`GenreId`")
	private int genreId;
	
	@Column(name = "`Name`")
	private String name;

	public Genre(int genreId, String name) {
		this.genreId = genreId;
		this.name = name;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
