package com.myprojects.myfavmusic.bo;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.mockito.Matchers;
import org.mockito.Mockito;

import com.myprojects.myfavmusic.bo.impl.MusicManagerImpl;
import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

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

	public void testListAllSongsBySpec() {
		List<Song> list = new ArrayList<Song>();
		Song song = new Song();
		list.add(song);
		Mockito.when(musicDao.listAllSongsBySpec((SongSpec)Matchers.any())).thenReturn(list);
		SongSpec spec = new SongSpec();
		List<Song> allSongs = musicManager.listAllSongsBySpec(spec);
		assertNotNull(allSongs);
	}
}
