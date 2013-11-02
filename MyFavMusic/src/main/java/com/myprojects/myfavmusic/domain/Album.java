package com.myprojects.myfavmusic.domain;

/**
 * @author arun An album could be a movie or an Album. Each album has a title
 * Type - Movie or album, Could use an enum for this
 */
public class Album {
	private Integer id;
	private String title;
	// album or song , this could be replaced with enum later
	private String type;
	private Integer releasedYear;
}
