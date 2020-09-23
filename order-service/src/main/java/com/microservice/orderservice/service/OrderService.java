package com.microservice.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderrepository;
	
	public Order saveOrder(Order order) {
		return orderrepository.save(order);
	}

}
