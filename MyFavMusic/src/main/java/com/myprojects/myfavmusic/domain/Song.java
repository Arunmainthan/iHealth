package com.myprojects.myfavmusic.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author arun 
 * Individual Song implementation A song object will represent a
 * music including the title. This has many to one relationship with
 * Album and Singer
 */
@Entity
public class Song implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	public Song(){
		
	}
	public Song(String title, Album album, Singer singer, Integer rating) {
		super();
		Title = title;
		this.album = album;
		this.singer = singer;
		this.rating = rating;
	}

	private String Title;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "ALBUM_ID", nullable = false)
	private Album album;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "SINGER_ID", nullable = false)
	private Singer singer;
	
	private Integer rating;
}
