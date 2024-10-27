package com.deepak.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.graphql.entites.Order;
import com.deepak.graphql.helper.Helper;
import com.deepak.graphql.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepo orderRepo;

	public OrderServiceImpl(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}

	@Override
	public Order createOrder(Order order) {
		orderRepo.save(order);
		return null;
	}
	//getting all order

	@Override
	public List<Order> getAllOrder() {
		
		return orderRepo.findAll();
	}

	@Override
	public Order order(int orderId) {
		Order order=orderRepo.findById(orderId).orElseThrow(Helper::throwRuntimeException);
		return order;
	}

	@Override
	public boolean deleteOrder(int orderId) {
		Order order=orderRepo.findById(orderId).orElseThrow(Helper::throwRuntimeException);
		orderRepo.delete(order);
		return true;
	}
	
	
	
}
