package com.desafio.desafioInjecao.services;

import org.springframework.stereotype.Service;

import com.desafio.desafioInjecao.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {
		return order.getBasic() + shippingService.shipment(order);
	}
}
