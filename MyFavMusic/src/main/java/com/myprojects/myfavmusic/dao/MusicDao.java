package com.myprojects.myfavmusic.dao;

import java.util.List;

import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

/**
 * @author arun Dao layer for all the music management services
 */
public interface MusicDao {

	/**
	 * @param song
	 *            - song to be added
	 */

	public void addSong(Song song);
	
	public void addAlbum(Album album);

	/**
	 * @param spec
	 * @return list of songs matching the search criteria
	 */
	public List<Song> listAllSongsBySpec(SongSpec spec);

	public Song getSongByID(Integer id);

	public Album getAlbumByID(Integer id);
	
	public Album getAlbumByTitle(String title);
	
	public Singer getSingerByName(String name);
}
