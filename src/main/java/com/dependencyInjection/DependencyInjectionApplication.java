package com.dependencyInjection;

import com.dependencyInjection.entiry.Order;
import com.dependencyInjection.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------------------------");
		Order order1 = new Order(1034, 150, 20.0);
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: R$" + orderService.total(order1));

		System.out.println("----------------------------------------");
		Order order2 = new Order(2282, 800, 10.0);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$" + orderService.total(order2));

		System.out.println("----------------------------------------");
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$" + orderService.total(order3));
	}
}
