package com.myprojects.myfavmusic.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

public class MusicDaoImpl implements MusicDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void addSong(Song song) {
		//sessionFactory.getCurrentSession().setFlushMode(FlushMode.COMMIT);
		sessionFactory.getCurrentSession().save(song);
	}

	@Override
	public List<Song> listAllSongsBySpec(SongSpec spec) {
		return null;
	}
	
//	@Transactional
//	@Override
//	public List<Song> listAllSongsByAlbum(Album album) {
//		return album.getSongs();
//	}
	
	@Transactional
	@Override
	public Song getSongByID(Integer id) {
		return (Song)sessionFactory.getCurrentSession().get(Song.class,id);
	}
	
	@Transactional
	@Override
	public Album getAlbumByID(Integer id) {
		return (Album)sessionFactory.getCurrentSession().get(Album.class,id);
	}

	@Transactional
	@Override
	public Album getAlbumByTitle(String title) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Album where title=?");
		query.setParameter(0, title);
		List<Album> list = (List<Album>)query.list();
		return (list.size()>0)?list.get(0):null;
	}
	
	@Transactional
	@Override
	public Singer getSingerByName(String name) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Singer where singerName=?");
		query.setParameter(0, name);
		List<Singer> list = (List<Singer>)query.list();
		return (list.size()>0)?list.get(0):null;
	}

	@Transactional
	@Override
	public void addAlbum(Album album) {
		sessionFactory.getCurrentSession().save(album);
		
	}

	@Transactional
	@Override
	public List<Song> listAllSongs() {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Song");
		List<Song> list = (List<Song>)query.list();
		return list;
	}
}