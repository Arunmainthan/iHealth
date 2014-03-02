/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.dao;

import com.news.bo.Users;
import java.util.List;
import org.hibernate.Criteria;
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
public class UserDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory factory;
    
    @Override
    public int addUser(Users user) throws DataAccessException {
        Session session = factory.getCurrentSession();
        session.persist(user);
        return 1;
    }

    @Override
    public Users getUser(Users user) throws DataAccessException {
        Session session = factory.getCurrentSession();
        String strQuery = "from Users where email=:em";
        Query query = session.createQuery(strQuery);
        query.setParameter("em", user.getId());
        List<Users> userList = query.list();
        if (userList != null && !userList.isEmpty()) {
            return (Users) query.list().get(0);
        } else {
            return null;
        }
    }
    
}
