package com.myprojects.myfavmusic.domain;

import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author arun 
 * Individual Song implementation A song object will represent a
 * music including the title. This has many to one relationship with
 * Album and Singer
 */
@Entity
@Table(name="Song", catalog="myFavMusic")
public class Song implements Serializable {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Album album;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Singer singer;
	
	private Integer rating;
}
