package com.myprojects.myfavmusic.domain;

/**
 * @author arun 
 * Individual Song implementation A song object will represent a
 * music including the title. This has many to one relationship with
 * Album and Singer
 */
public class Song {
	private Integer id;
	SongSpec spec;
}
