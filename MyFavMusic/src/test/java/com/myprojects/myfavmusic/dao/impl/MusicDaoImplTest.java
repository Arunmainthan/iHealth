package com.myprojects.myfavmusic.dao.impl;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/ApplicationContext-unitFav.xml"})
public class MusicDaoImplTest extends TestCase {
	
	@Autowired
	private MusicDao musicDao;
	@Test
	@Transactional
	public void testAddSong() {
		Album album = new Album("album1","movie",2009);
		Singer singer = new Singer("singer 1",new Date());
		Song song = new Song("song 1",album,singer,0);
		musicDao.addSong(song);
		assertTrue(true);
	}

	public void testListAllSongsBySpec() {
		fail("Not yet implemented");
	}

}