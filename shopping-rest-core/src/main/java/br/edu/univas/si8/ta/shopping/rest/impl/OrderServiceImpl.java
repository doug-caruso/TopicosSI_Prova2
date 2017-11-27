package br.edu.univas.si8.ta.shopping.rest.impl;

import javax.ejb.EJB;

import br.edu.univas.si8.ta.shopping.ejb.interfaces.Shoppings;
import br.edu.univas.si8.ta.shopping.rest.api.OrderService;

public class OrderServiceImpl implements OrderService {

	@EJB(mappedName = "java:app/shoppings-ejb-0.1-SNAPSHOT/ShoppingBean!br.edu.univas.si8.ta.shopping.ejb.interfaces.ShoppingsRemote")
	private Shoppings shopping;

	@Override
	public String createOrder(String description) {
		shopping.createNewOrder(description);
		return "{\"message\": \"Success\"}";
	}

	@Override
	public String[] listOrderDescription() {
		return shopping.listDescription();
	}

	
}
