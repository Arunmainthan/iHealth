package com.myprojects.myfavmusic.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myprojects.myfavmusic.bo.MusicManager;
import com.myprojects.myfavmusic.dao.MusicDao;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

public class MusicManagerImpl implements MusicManager {

	@Autowired
	private MusicDao musicDao;

	public MusicDao getMusicDao() {
		return musicDao;
	}

	public void setMusicDao(MusicDao musicDao) {
		this.musicDao = musicDao;
	}

	@Override
	public void addSong(Song song) {
		musicDao.addSong(song);
	}
	
	public List<Song> listAllSongsBySpec(SongSpec spec) {
		List<Song> songs = musicDao.listAllSongsBySpec(spec);
		return songs;
	}

	@Override
	public List<Song> listAllSongs() {
		// TODO Auto-generated method stub
		List<Song> songs = musicDao.listAllSongs();
		return songs;
	}

        @Override
        public Album getAlbumByID(int albumID) {
                // TODO Auto-generated method stub
                return musicDao.getAlbumByID(albumID);
        }

        @Override
        public void addAlbum(String albumName) {
                // TODO Auto-generated method stub
                Album album = musicDao.getAlbumByTitle(albumName);
                if (album == null) {
                        album = new Album("album1","movie",2009);
                        musicDao.addAlbum(album);
                }
        }

        @Override
        public void addSong(String songTitle) {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void addSong(String songTitle, String rating, int albumID,
                        int singerID) {
                // TODO Auto-generated method stub
                Song song = musicDao.getSongByTitle(songTitle);
                if (song == null) {
                        Album album = musicDao.getAlbumByID(albumID);
                        Singer singer = musicDao.getSingerByID(singerID);
                        song = new Song(songTitle,album,singer,0);
                        musicDao.addSong(song);
                }    
        }

        @Override
        public List<Album> listAllAlbums() {
                // TODO Auto-generated method stub
                return musicDao.listAllAlbums();
        }

        @Override
        public List<Singer> listAllSingers() {
                // TODO Auto-generated method stub
                return musicDao.listAllSingers();
        }
}
