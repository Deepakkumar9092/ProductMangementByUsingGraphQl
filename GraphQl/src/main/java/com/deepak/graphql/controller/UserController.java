package com.deepak.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.graphql.entites.User;
import com.deepak.graphql.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//create user api
	@MutationMapping
	public User createUser(@Argument String name,@Argument String phone, @Argument String email, @Argument String password) {
		User user=new User();
		user.setName(name);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		return userService.createUser(user);
	}
	//get all user
	@QueryMapping(name="getUsers")
	public List<User>getAllUser(){
		
		return userService.getAllUsers();
		
	}
	//get single user
	@QueryMapping
	public User getUser(@Argument int userId) {
		return userService.getUser(userId);
	}
	
	//delete usr
	@MutationMapping
	public boolean deleteUser(int userid) {
		
		return userService.deleterUser(userid);
	}
	
}
