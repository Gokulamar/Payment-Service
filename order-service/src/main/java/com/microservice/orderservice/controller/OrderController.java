package com.microservice.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {


	@Autowired
	OrderService orderService;


	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}

}
