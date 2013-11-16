package com.myprojects.myfavmusic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class SongSpec {
	
	private String Title;
	
	private Album album;
	
	private Singer singer;
}