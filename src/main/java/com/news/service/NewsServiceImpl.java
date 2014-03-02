/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.service;

import com.news.bo.News;
import com.news.dao.NewsDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Gaiyya
 */

@Service
@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
public class NewsServiceImpl  implements NewsService {

    @Autowired
    private NewsDAO newDAO;
    
    @Override
    @Transactional(propagation= Propagation.REQUIRED, readOnly=false, timeout= 100000, isolation= Isolation.SERIALIZABLE)
    public int addNews(News news) throws DataAccessException {
        return newDAO.addNews(news);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED, readOnly=false, timeout= 100000)
    public List<News> getNews() throws DataAccessException {
        return newDAO.getNews();
    }
    
}
