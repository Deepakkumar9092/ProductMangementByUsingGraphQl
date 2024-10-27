package com.deepak.graphql.service;

import java.util.List;

import com.deepak.graphql.entites.Order;


public interface OrderService {
	
	//create order
	public Order createOrder(Order order);
	
	//getting all order
	public List<Order>getAllOrder();
	
	//get single order
	
	public Order order(int orderId);
	
	//delete order
	public boolean deleteOrder(int orderId);
	

}
