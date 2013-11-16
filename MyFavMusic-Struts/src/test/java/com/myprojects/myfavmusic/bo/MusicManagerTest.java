package com.myprojects.myfavmusic.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.mockito.Matchers;
import org.mockito.Mockito;

import com.myprojects.myfavmusic.bo.impl.MusicManagerImpl;
import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
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
		Album album = new Album("album1","movie",2009);
		Singer singer = new Singer("singer 1",new Date());
		Song song = new Song("song 1",album,singer,0);
		list.add(song);
		Mockito.when(musicDao.listAllSongsBySpec((SongSpec)Matchers.any())).thenReturn(list);
		SongSpec spec = new SongSpec();
		List<Song> allSongs = musicManager.listAllSongsBySpec(spec);
		assertNotNull(allSongs);
	}
}
