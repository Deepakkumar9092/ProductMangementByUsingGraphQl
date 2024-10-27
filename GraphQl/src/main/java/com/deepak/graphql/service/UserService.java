package com.deepak.graphql.service;

import java.util.List;

import com.deepak.graphql.entites.User;

public interface UserService {
	
 
	//create user
	 public User createUser(User user);
	 
	//getting all user
	 
	 public List<User>getAllUsers();
	 
	
	//getting single user
	 
	 public User getUser(int UserId);
	
	//updating user
	
	//deleting user
	 
	 public boolean deleterUser(int UserId);
}
