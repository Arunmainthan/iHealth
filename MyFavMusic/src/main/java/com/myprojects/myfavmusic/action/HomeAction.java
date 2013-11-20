package com.myprojects.myfavmusic.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myprojects.myfavmusic.bo.MusicManager;
import com.myprojects.myfavmusic.domain.Song;

public class HomeAction{
	
	private List<Song> allSongs;

	private MusicManager musicManager; 

	public MusicManager getMusicManager() {
		return musicManager;
	}

	public void setMusicManager(MusicManager musicManager) {
		this.musicManager = musicManager;
	}

	// all struts logic here
	public String displayAllSongs() {
		allSongs = musicManager.listAllSongs();
		return "SUCCESS";
 
	}
}
