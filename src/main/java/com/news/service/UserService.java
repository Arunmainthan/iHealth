/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.service;

import com.news.bo.Users;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Gaiyya
 */
public interface UserService {
    int addUser(Users user) throws DataAccessException;
    Users getUser(Users user) throws DataAccessException;
}
