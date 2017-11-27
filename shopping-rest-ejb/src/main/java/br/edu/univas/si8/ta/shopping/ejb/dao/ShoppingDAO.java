package br.edu.univas.si8.ta.shopping.ejb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.shopping.ejb.entities.Shopping;

public class ShoppingDAO {
	
	@PersistenceContext(unitName = "orders")
	private EntityManager em;

	public void insert(Shopping order) {
		em.persist(order);
	}

	public List<Shopping> listAll() {
		return em.createQuery("from shopping_order s", Shopping.class).getResultList();
	}

}
