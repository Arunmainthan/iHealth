package com.myprojects.myfavmusic.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myprojects.myfavmusic.bo.MusicManager;
import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

public class MusicManagerImpl implements MusicManager {

	@Autowired
	private MusicDao musicDao;

	public MusicDao getMusicDao() {
		return musicDao;
	}

	public void setMusicDao(MusicDao musicDao) {
		this.musicDao = musicDao;
	}

	public void addSong(Song song) {
		musicDao.addSong(song);
	}

	public List<Song> listAllSongsBySpec(SongSpec spec) {
		List<Song> songs = musicDao.listAllSongsBySpec(spec);
		return songs;
	}

	@Override
	public List<Song> listAllSongs() {
		// TODO Auto-generated method stub
		List<Song> songs = musicDao.listAllSongs();
		return songs;
	}
}
