package com.deepak.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.graphql.entites.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	//custom query method
	//custom finder method

}
