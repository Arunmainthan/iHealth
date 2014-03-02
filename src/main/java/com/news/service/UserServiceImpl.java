/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.service;

import com.news.bo.Users;
import com.news.dao.UsersDAO;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDAO userDAO;
    
    @Override
    @Transactional(propagation= Propagation.REQUIRED, readOnly=false, timeout= 100000, isolation= Isolation.SERIALIZABLE)
    public int addUser(Users user) throws DataAccessException {
        return userDAO.addUser(user);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED, readOnly=false, timeout= 100000)
    public Users getUser(Users user) throws DataAccessException {
        return userDAO.getUser(user);
    }
    
}
