package com.myprojects.myfavmusic.bo;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.mockito.Matchers;
import org.mockito.Mockito;

import com.myprojects.myfavmusic.bo.impl.MusicManagerImpl;
import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Song;

/**
 * @author arun Unit Test for manager
 */
public class MusicManagerTest extends TestCase {

	MusicManagerImpl musicManager = new MusicManagerImpl();
	MusicDao musicDao = Mockito.mock(MusicDao.class);

	@Override
	public void setUp() {
		musicManager.setMusicDao(musicDao);
	}

	public void testAddSong() {
		fail("Not yet implemented");
	}

	public void testListAllSongs() {
		List<Song> list = new ArrayList<Song>();
		Song song = new Song();
		list.add(song);
		Mockito.
		Mockito.when(musicDao.listAllSongsBySpec(Matchers.any()).thenReturn(list);
		List<Song> allSongs = musicManager.listAllSongs();
		assertNotNull(allSongs);
	}
}
