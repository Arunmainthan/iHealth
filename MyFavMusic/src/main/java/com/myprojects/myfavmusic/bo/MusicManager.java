package com.myprojects.myfavmusic.bo;

import java.util.List;

import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;
import com.myprojects.myfavmusic.domain.SongSpec;

/**
 * @author arun Interface to manage songs
 */
public interface MusicManager {
        public void addSong(Song song);

        public List<Song> listAllSongsBySpec(SongSpec spec);

        public List<Song> listAllSongs();

        public Album getAlbumByID(int albumID);

        public void addAlbum(String albumName);

        void addSong(String songTitle);

        public void addSong(String songTitle, String rating, int albumID,
                        int singerID);

        public List<Album> listAllAlbums();

        public List<Singer> listAllSingers();
}
