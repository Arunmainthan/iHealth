/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.ctrl;

import com.news.bo.News;
import com.news.bo.Users;
import com.news.service.NewsService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Gaiyya
 */

@Controller
public class NewsController {
    
    @Autowired
    private NewsService newsService;
    
    @RequestMapping(method = RequestMethod.GET, value = "savenews.html")
    public String getNews(@RequestParam("t")String title, @RequestParam("c")String content, @RequestParam("d")String date, @RequestParam("u")String url, HttpServletRequest request) {
        HttpSession session = request.getSession();
        
        Users user = (Users) session.getAttribute("login");
        final News news = new News();
        news.setTitle(title);news.setPublishDate(date);news.setUrl(url);
        news.setUser(user);
        if (content.length() > 140) {
            content = content.substring(0, 140);
            news.setContent_vers(content);
            news.setContent(content);
        }
        news.setContent(content);
        new Thread(new Runnable() {

            @Override
            public void run() {
                newsService.addNews(news);
            }
        }).start();
        
        
        return "success";
    }
    
    @RequestMapping(method=RequestMethod.GET, value="news.html")
    public String showNewspage(HttpServletRequest request) {
            HttpSession session = request.getSession();
            Users user = (Users) session.getAttribute("login");
            if (user == null) {
                    return "login";
            } else {
                    return "news";
            }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "count.html")
    public String setCount(@RequestParam("c")String count, HttpServletRequest request) {
        int cnt = Integer.parseInt(count);
        cnt++;
        request.getSession().setAttribute("count", cnt);
        System.out.println("Sett/////////////////////////"+count);
        return "success";
    }
}
