/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.ctrl;

import com.news.bo.Users;
import com.news.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Arun
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    
    private static final String SUCCESS = "You have successfully sign up";
    private static final String FAIL = "Sign up failed. Please try again later";
    private static final String FAIL_LOGIN = "Login failed. Please try again later";

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "register.html")
    public String signupUser(@RequestParam("fn") String firstName, @RequestParam("sn") String lastName, @RequestParam("em") String email, @RequestParam("pw") String password, HttpServletRequest request) {
        try {
            Users user = new Users();
            user.setId(email);
            user.setFirstName(firstName);
            user.setSurName(lastName);
            user.setPassword(password);

            Users prevUser = userService.getUser(user);
            if (prevUser != null) {
                request.setAttribute("fail", "Sign up failed. User email already exist");
            } else {
                userService.addUser(user);
                HttpSession session = request.getSession();
                session.setAttribute("login", user);
                request.setAttribute("success", SUCCESS);
            }

        } catch (DataAccessException dataAccessException) {
            dataAccessException.printStackTrace();
            request.setAttribute("fail", FAIL);
        } catch (Exception ex) {
            ex.printStackTrace();
            request.setAttribute("fail", FAIL);
        }
        return "signup";
    }
    
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "signin.html")
    public String userLogin(@RequestParam("em")String email, @RequestParam("pw")String password, HttpServletRequest request) {
        try {
            Users user = new Users();
            user.setId(email);

            Users prevUser = userService.getUser(user);
            if (prevUser != null) {
                if (password.equals(prevUser.getPassword())) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login", prevUser);
                    return "news";
                } else {
                    request.setAttribute("fail", "Invalid Password! Please sign up to continue");
                    return "login";
                }
            } else {
                userService.addUser(user);
                request.setAttribute("fail", "Email address does not exist! Please sign up to continue");
                return "login";
            }

        } catch (DataAccessException dataAccessException) {
            dataAccessException.printStackTrace();
            request.setAttribute("fail", FAIL_LOGIN);
            return "login";
        } catch (Exception ex) {
            ex.printStackTrace();
            request.setAttribute("fail", FAIL_LOGIN);
            return "login";
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "logout.html")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "index";
    }
}
