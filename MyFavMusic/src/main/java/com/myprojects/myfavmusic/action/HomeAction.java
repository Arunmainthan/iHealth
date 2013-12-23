package com.myprojects.myfavmusic.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.myprojects.myfavmusic.bo.MusicManager;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Singer;
import com.myprojects.myfavmusic.domain.Song;

public class HomeAction implements ServletRequestAware {
        
        private MusicManager musicManager;

        HttpServletRequest request;

        private List<Song> allSongs;
        
        private Map<String,String> allSingers;
        
        public Map<String, String> getAllSingers() {
                return allSingers;
        }

        public void setAllSingers(Map<String, String> allSingers) {
                this.allSingers = allSingers;
        }

        public Map<String, String> getAllAlbums() {
                return allAlbums;
        }

        public void setAllAlbums(Map<String, String> allAlbums) {
                this.allAlbums = allAlbums;
        }

        private Map<String, String> allAlbums;
        
        public List<Song> getAllSongs() {
                return allSongs;
        }

        public void setAllSongs(List<Song> allSongs) {
                this.allSongs = allSongs;
        }


        public MusicManager getMusicManager() {
                return musicManager;
        }

        public void setMusicManager(MusicManager musicManager) {
                this.musicManager = musicManager;
        }

        // all struts logic here
        public String displayAllSongs() {
                allSongs = musicManager.listAllSongs();
                return "SUCCESS";

        }

        public String addAlbum() {
                // allSongs = musicManager.listAllSongs();
                if (request.getParameterMap().containsKey("albumName")) {
                        try {
                                musicManager.addAlbum(request.getParameter("albumName"));
                                return "ADD_SUCCESS";
                        } catch(Exception ex){
                                return "ALREADY_EXISTS";
                        }
                } else {
                        return "DISPLAY_ADD_PAGE";
                }

        }
        
        public String addSong() {
                // allSongs = musicManager.listAllSongs();
                if (request.getParameterMap().containsKey("songTitle")) {
                        String songTitle = request.getParameter("songTitle");
                        String rating = request.getParameter("rating");
                        int albumID = Integer.parseInt(request.getParameter("albumID"));
                        int singerID = Integer.parseInt(request.getParameter("singerID"));
                        
                        try {
                                musicManager.addSong(songTitle, rating, albumID, singerID);
                                return "ADD_SUCCESS";
                        } catch(Exception ex){
                                return "ALREADY_EXISTS";
                        }
                } else {
                        allAlbums = musicManager.listAllAlbumsAsMap();
                        allSingers = musicManager.listAllSingersAsMap();
                        return "DISPLAY_ADD_PAGE";
                }

        }

        // all struts logic here
        public String displayAllSongsFromAlbum() {
                // ServletActionContext.getRequest().
                // allSongs = musicManager.listAllSongsFr();
                if (request.getParameterMap().containsKey("albumID")) {
                        int albumID = Integer.parseInt(request
                                        .getParameter("albumID"));
                        Album album = musicManager.getAlbumByID(albumID);
                        allSongs = album.getSongs();
                }
                return "SUCCESS";

        }

        @Override
        public void setServletRequest(HttpServletRequest request) {
                // TODO Auto-generated method stub
                this.request = request;

        }
}
