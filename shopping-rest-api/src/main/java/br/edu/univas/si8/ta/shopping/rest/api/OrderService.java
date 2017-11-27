package br.edu.univas.si8.ta.shopping.rest.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/order")
public interface OrderService {

	@POST
	@Path("/add/{description}")
	@Produces(MediaType.APPLICATION_JSON)
	String createOrder(@PathParam("description") String description);
	
	

}
