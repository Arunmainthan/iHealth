package com.myprojects.myfavmusic.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.myprojects.myfavmusic.bo.MusicManager;
import com.myprojects.myfavmusic.domain.Album;
import com.myprojects.myfavmusic.domain.Song;

public class HomeAction implements ServletRequestAware {

        HttpServletRequest request;

        private List<Song> allSongs;

        public List<Song> getAllSongs() {
                return allSongs;
        }

        public void setAllSongs(List<Song> allSongs) {
                this.allSongs = allSongs;
        }

        private MusicManager musicManager;

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
