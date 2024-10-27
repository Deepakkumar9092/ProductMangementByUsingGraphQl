package com.deepak.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.graphql.entites.User;
import com.deepak.graphql.helper.Helper;
import com.deepak.graphql.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}


//creating user
	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

//For getting all user 
	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

// Getting single user
	@Override
	public User getUser(int UserId) {
	
		 User user = userRepo.findById(UserId).orElseThrow(Helper::throwRuntimeException);
		 return user;
	}

	//Delete User

	@Override
	public boolean deleterUser(int UserId) {
		User user = userRepo.findById(UserId).orElseThrow(Helper::throwRuntimeException);
		userRepo.delete(user);
		return true;
	}
	
	//

}
