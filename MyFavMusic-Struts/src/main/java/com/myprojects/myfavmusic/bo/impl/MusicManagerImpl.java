package com.myprojects.myfavmusic.bo.impl;

import java.util.List;

import com.myprojects.myfavmusic.bo.MusicManager;
import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

public class MusicManagerImpl implements MusicManager {

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
}
