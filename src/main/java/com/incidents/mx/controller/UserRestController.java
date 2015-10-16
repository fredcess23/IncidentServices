package com.incidents.mx.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incidents.mx.dao.UserDAO;
import com.incidents.mx.dao.UserDAOImpl;
import com.incidents.mx.model.*;
 
@RestController
public class UserRestController {

	private UserDAO user = new UserDAOImpl();

	@RequestMapping("/user")
    public List<User> getAllUsers() {
		return user.list();
    }
	@RequestMapping("/user/{person}")
    public User getUser(@PathVariable String person) {
		return user.getUser(person);
    }

}