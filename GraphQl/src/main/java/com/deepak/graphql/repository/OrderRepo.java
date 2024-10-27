package com.deepak.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.graphql.entites.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
