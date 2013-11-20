package com.myprojects.myfavmusic.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

/**
 * @author arun Unit Test for manager
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/ApplicationContext-unitFav.xml"})
public class MusicManagerTest{

	@Autowired
	private MusicManager musicManager;
	
	//MusicDao musicDao = Mockito.mock(MusicDao.class);

	@Test
	public void testListAllSongs() {
		List<Song> list = new ArrayList<Song>();
		//Mockito.when(musicDao.listAllSongsBySpec((SongSpec)Matchers.any())).thenReturn(list);
		List<Song> allSongs = musicManager.listAllSongs();
		Assert.notNull(allSongs);
		Assert.isTrue(allSongs.size() >0);
	}
}
