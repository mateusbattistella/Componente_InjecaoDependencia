package com.desafio.desafioInjecao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.desafioInjecao.entities.Order;
import com.desafio.desafioInjecao.services.OrderService;

@SpringBootApplication
public class DesafioInjecaoApplication implements CommandLineRunner {
	
  private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioInjecaoApplication.class, args);
	}
	
	public DesafioInjecaoApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Order order = new Order(1034, 150, 20);
		System.out.println("Pedido código " + order.getCode().toString());
		System.out.println("Valor total: R$ " + orderService.total(order));
		
		Order order1 = new Order(2282, 800, 10);
		System.out.println("Pedido código " + order1.getCode().toString());
		System.out.println("Valor total: R$ " + orderService.total(order1));
		
		Order order2 = new Order(1309, 95.90, 0);
		System.out.println("Pedido código " + order2.getCode().toString());
		System.out.println("Valor total: R$ " + orderService.total(order2));
	}

}
