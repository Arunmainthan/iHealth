package com.myprojects.myfavmusic.dao.impl;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

public class MusicDaoImpl implements MusicDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void addSong(Song song) {
		sessionFactory.getCurrentSession().setFlushMode(FlushMode.COMMIT);
		sessionFactory.getCurrentSession().save(song);
		System.out.print("hello");
	}

	public List<Song> listAllSongsBySpec(SongSpec spec) {
		return null;
	}

}
