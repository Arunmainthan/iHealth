package com.myprojects.myfavmusic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author arun An album could be a movie or an Album. Each album has a title
 * Type - Movie or album, Could use an enum for this
 */
@Entity
public class Album {
	
	public Album(String title, String type, Integer releasedYear) {
		super();
		this.title = title;
		this.type = type;
		this.releasedYear = releasedYear;
	}

	@Id
	@GeneratedValue
	@Column(name = "ALBUM_ID", unique = true, nullable = false, length = 20)
	private Integer id;
	
	@Column(name = "TITLE", unique = true, nullable = false)
	private String title;
	
	// album or song , this could be replaced with enum later
	@Column(name = "TYPE", unique = true, nullable = false)
	private String type;
	
	@Column(name = "RELEASED_YEAR", unique = true, nullable = false)
	private Integer releasedYear;
}
