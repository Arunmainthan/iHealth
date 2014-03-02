/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.dao;

import com.news.bo.News;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Arun
 */
public interface NewsDAO {
    int addNews(News news) throws DataAccessException;
    List<News> getNews() throws DataAccessException;
}
