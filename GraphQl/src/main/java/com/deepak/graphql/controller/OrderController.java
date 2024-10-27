package com.deepak.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.graphql.entites.Order;
import com.deepak.graphql.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	public OrderController(OrderService orderService) {

		this.orderService = orderService;
	}
	//create order
		public Order createOrder(@Argument String orderDetails,
				@Argument String address,
				@Argument int price,
				@Argument int userId) {
			
			Order order= new Order();
			order.setAddress(address);
			order.setOrderDetails(orderDetails);
			order.setPrice(price);
			return orderService.createOrder(order);
		}
		
		//get all order
		@QueryMapping(name="getOrders")
		public List<Order>getALlOrder(){
			return orderService.getAllOrder();
		}
		
		//get single order
		@QueryMapping
		public Order getOrder(@Argument int orderId) {
			return orderService.order(orderId);
		}
		
		//delete order
		@MutationMapping
		public boolean deleteOrder(int orderId) {
			return orderService.deleteOrder(orderId);
		}
}
