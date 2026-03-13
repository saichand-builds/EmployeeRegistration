package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Orders;
import com.example.Service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderService service;

	@PostMapping("/save")
	public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
		Orders saved = service.SaveOder(order);
		return ResponseEntity.ok(saved);
	}

}
