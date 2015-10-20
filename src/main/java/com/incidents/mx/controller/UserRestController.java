package com.incidents.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incidents.mx.dao.UserDAO;
import com.incidents.mx.model.*;
 
@RestController
//@Component
public class UserRestController {

	// By using ioc of spring
	private UserDAO user;
	
	@Autowired
	public UserRestController(UserDAO user) {
		this.user = user;
	}
	
	@RequestMapping("/users")
    public List<User> getAllUsers() {
		return user.list();
    }
	@RequestMapping("/user/{person}")
    public User getUser(@PathVariable String person) {
		return user.getUser(person);
    }

}