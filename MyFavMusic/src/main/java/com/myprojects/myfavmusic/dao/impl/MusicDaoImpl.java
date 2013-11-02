package com.myprojects.myfavmusic.dao.impl;

import java.util.List;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

public class MusicDaoImpl implements MusicDao{
	SessionFactory sessionFactory;

	public void addSong(Song song) {
		
	}

	public List<Song> listAllSongsBySpec(SongSpec spec) {
		return null;
	}

}
