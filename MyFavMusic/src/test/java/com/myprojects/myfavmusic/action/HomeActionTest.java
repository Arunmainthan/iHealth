package com.myprojects.myfavmusic.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.myprojects.myfavmusic.bo.MusicManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/ApplicationContext-unitFav.xml"})
public class HomeActionTest {
        
        @Autowired
        private MusicManager musicManager;
        
        HomeAction homeAction = new HomeAction();
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        
        @Test
        public void testAddSong() {
                homeAction.setServletRequest(request);
                homeAction.setMusicManager(musicManager);
                String songTitle = "New Song " + Math.random()*100;
                String rating = "4";
                String albumID = "2";
                String singerID = "1";
                
                
                Map<String, String[]> parameterMapDummy = new HashMap<String, String[]>();
                parameterMapDummy.put("songTitle", null);
                
                Mockito.when(request.getParameterMap()).thenReturn(parameterMapDummy);
                
                Mockito.when(request.getParameter("songTitle")).thenReturn(songTitle);
                Mockito.when(request.getParameter("rating")).thenReturn(rating);
                Mockito.when(request.getParameter("albumID")).thenReturn(albumID);
                Mockito.when(request.getParameter("singerID")).thenReturn(singerID);
                
                String results = homeAction.addSong();
                Assert.isTrue(results.equals("ADD_SUCCESS"));
                //fail("Not yet implemented");
        }

}
