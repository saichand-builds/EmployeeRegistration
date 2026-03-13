package com.example.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.OrderItems;
import com.example.Model.Orders;
import com.example.Repo.IoderRepository;
import com.example.Service.IOrderService;

@Service
public class OrderServiceImple implements IOrderService {

	@Autowired
	private IoderRepository repo;

	@Override
	public Orders SaveOder(Orders order) {
			// get the  Items 
			// and save the Items
		List<OrderItems> items = order.getItems();
		for (OrderItems item : items) {
			item.setOrders(order);
		}
		return repo.save(order);
	}

}
