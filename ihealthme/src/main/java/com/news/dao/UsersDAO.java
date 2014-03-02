/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.dao;

import com.news.bo.Users;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Gaiyya
 */
public interface UsersDAO {
    int addUser(Users user) throws DataAccessException;
    Users getUser(Users user) throws DataAccessException;    
}
