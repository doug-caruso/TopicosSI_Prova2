package br.edu.univas.si8.ta.shopping.rest.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/order")
public interface OrderService {

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	String createOrder(@FormParam("description") String description);
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listOrderDescription();
	
}
