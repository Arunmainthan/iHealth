package com.myprojects.myfavmusic.dao.impl;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/ApplicationContext-unitFav.xml"})
public class MusicDaoImplTest{
	
	@Autowired
	private MusicDao musicDao;
	
	@Test
	public void testAddSong() {
		Album album = musicDao.getAlbumByTitle("album1");
		if (album == null) {
			album = new Album("album1","movie",2009);
		}
		Assert.notNull(album);
		
		Singer singer = musicDao.getSingerByName("singer 1");
		if (singer == null) {
			singer = new Singer("singer 1",new Date());
		}
		Assert.notNull(singer);
		
		Song song = new Song("song " + Math.random() * 100,album,singer,0);
		musicDao.addSong(song);
	}
	
	@Test
	public void testListAllSongsByAlbum() {
		Album album = musicDao.getAlbumByTitle("album1");
		if (album == null) {
			album = new Album("album1","movie",2009);
			musicDao.addAlbum(album);
		}
		Assert.notNull(album);
		Assert.isTrue(album.getSongs().size()>0);
	}
	
//	@Test
//	public void testGetSongByID(){
//		Song song = musicDao.getSongByID(1);
//		Assert.notNull(song);
//	}
}
