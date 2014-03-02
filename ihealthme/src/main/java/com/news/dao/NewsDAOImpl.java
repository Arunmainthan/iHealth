/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.dao;

import com.news.bo.News;
import com.news.bo.Users;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gaiyya
 */

@Repository
public class NewsDAOImpl  implements NewsDAO {
    
    @Autowired
    private SessionFactory factory;

    @Override
    public int addNews(News news) throws DataAccessException {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(news);
        return 1;
    }

    @Override
    public List<News> getNews() throws DataAccessException {
        Session session = factory.getCurrentSession();
        String strQuery = "from News";
        Query query = session.createQuery(strQuery);
        return query.list();
    }
    
    
}
