package com.myprojects.myfavmusic.bo;

import java.util.List;

import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

/**
 * @author arun
 * Interface to manage songs
 */
public interface MusicManager {
	public void addSong(Song song);
	public List<Song> listAllSongsBySpec(SongSpec spec);
	public List<Song> listAllSongs();
}
