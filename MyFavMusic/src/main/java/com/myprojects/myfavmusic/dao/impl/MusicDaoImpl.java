package com.myprojects.myfavmusic.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

@Transactional
public class MusicDaoImpl implements MusicDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addSong(Song song) {
		sessionFactory.getCurrentSession().save(song);		
		sessionFactory.getCurrentSession().flush();
	}

	public List<Song> listAllSongsBySpec(SongSpec spec) {
		return null;
	}

}
