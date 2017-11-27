package br.edu.univas.si8.ta.shopping.ejb.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.shopping.ejb.dao.ShoppingDAO;
import br.edu.univas.si8.ta.shopping.ejb.entities.Shopping;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.ShoppingsLocal;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.ShoppingsRemote;

@Stateless
@Local(ShoppingsLocal.class)
@Remote(ShoppingsRemote.class)
public class ShoppingBean implements ShoppingsLocal, ShoppingsRemote {
	
	@EJB
	private ShoppingDAO dao;

	@Override
	public void createNewOrder(String description) {
		Shopping shopping = new Shopping();
		shopping.setDescription(description);
		Date order_time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		shopping.set(sdf.format(order_time));
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] listDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
