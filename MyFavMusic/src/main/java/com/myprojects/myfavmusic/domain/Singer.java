package com.myprojects.myfavmusic.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author arun Represents a Singer a single will have a name and dob
 */
@Entity
public class Singer {
	
	public Singer(String singerName, Date dob) {
		super();
		this.singerName = singerName;
		this.dob = dob;
	}

	@Id
	@GeneratedValue
	@Column(name = "SINGER_ID", unique = true, nullable = false, length = 20)
	private Integer id;
	private String singerName;
	private Date dob;
}
