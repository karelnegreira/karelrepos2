package com.loginregistrationjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginregistrationjpa.model.User;
import com.loginregistrationjpa.repos.Repository;

@Controller
public class WebController {
	@Autowired
	Repository repos;
@RequestMapping("/search")
public User getUserByName(@PathVariable("username") String username, @PathVariable("password") String password) {
	User usertest = (User) repos.findbyUsersandPassword(username, password);
	return usertest;
}



}
