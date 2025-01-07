package com.desafio.desafioInjecao.services;

import org.springframework.stereotype.Service;

import com.desafio.desafioInjecao.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double valor;

		valor = ((order.getBasic() * order.getDiscount()) / 100);

		if (order.getBasic() <= 100) {
			return valor - 20;
		} else if (order.getBasic() <= 200) {
			return valor - 12;
		} else return valor;
	}

}
