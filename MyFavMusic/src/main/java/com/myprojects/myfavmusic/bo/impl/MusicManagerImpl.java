package com.myprojects.myfavmusic.bo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                        album = new Album(albumName,"movie",2009);
                        musicDao.addAlbum(album);
                }
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
        public Map<String,String> listAllAlbumsAsMap() {
                // TODO Auto-generated method stub
                List<Album> albums = musicDao.listAllAlbums();
                
                Map<String, String> albumsMap = new HashMap<String,String>();
                for (Album album : albums) {
                        albumsMap.put(album.getId().toString(), album.getTitle());
                }
                return albumsMap;
        }

        @Override
        public List<Singer> listAllSingers() {
                // TODO Auto-generated method stub
                return musicDao.listAllSingers();
        }

        @Override
        public Map<String, String> listAllSingersAsMap() {
                // TODO Auto-generated method stub
                List<Singer> allSingers = musicDao.listAllSingers();
                Map<String, String> singersMap = new HashMap<String,String>();
                for (Singer singer : allSingers) {
                        singersMap.put(singer.getId().toString(), singer.getSingerName());
                }
                return singersMap;
        }
}
