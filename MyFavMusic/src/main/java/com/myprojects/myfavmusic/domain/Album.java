package com.myprojects.myfavmusic.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author arun An album could be a movie or an Album. Each album has a title
 *         Type - Movie or album, Could use an enum for this
 */
@Entity
public class Album implements Serializable {

        public Album() {
                super();
        }

        @OneToMany(fetch = FetchType.EAGER, mappedBy = "album")
        private List<Song> songs = null;

        @Id
        @GeneratedValue
        @Column(name = "ALBUM_ID", unique = true, nullable = false, length = 20)
        private Integer id;

        @Column(name = "TITLE", unique = true, nullable = false)
        private String title;

        // album or song , this could be replaced with enum later
        @Column(name = "TYPE", nullable = false)
        private String type;

        @Column(name = "RELEASED_YEAR", nullable = false)
        private Integer releasedYear;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public Integer getReleasedYear() {
                return releasedYear;
        }

        public void setReleasedYear(Integer releasedYear) {
                this.releasedYear = releasedYear;
        }

        public void setSongs(List<Song> songs) {
                this.songs = songs;
        }

        public List<Song> getSongs() {
                return songs;
        }

        public Album(String title, String type, Integer releasedYear) {
                super();
                this.title = title;
                this.type = type;
                this.releasedYear = releasedYear;
        }
}
