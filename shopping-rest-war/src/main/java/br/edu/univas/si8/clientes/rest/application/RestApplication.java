package br.edu.univas.si8.clientes.rest.application;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import br.edu.univas.si8.ta.shopping.rest.impl.OrderServiceImpl;

@ApplicationPath("/rest")
public class RestApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(OrderServiceImpl.class);
		return classes;
	}
}
