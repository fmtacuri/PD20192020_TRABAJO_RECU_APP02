package com.distribuida.todos.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value="/")
@ApplicationScoped
public class PingRest {
	
	@GET
	@Path(value="/ping")
	public String ping() {
		
		return "ok";
	}
}
