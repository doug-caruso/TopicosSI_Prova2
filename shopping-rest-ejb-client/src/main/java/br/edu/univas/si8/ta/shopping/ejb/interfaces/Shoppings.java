package br.edu.univas.si8.ta.shopping.ejb.interfaces;

public interface Shoppings {
	void createNewOrder(String description);
	String[] listDescription();
}
