package com.distribuida.todos.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.distribuida.todos.db.Todos;
import com.distribuida.todos.service.TodoService;

@Path("/todos")
@Produces("application/json")
@Consumes("application/json")
@ApplicationScoped
public class TodoRest {
	
	@PersistenceContext 
	private EntityManager em;
	
	@Inject
	TodoService service;
	
	@GET
	public List<Todos> findAll( ) {
		return service.findAll();
	}
	
	@GET
	@Path("/{id}")
	public Todos findById( @PathParam(value = "id") Integer id ) {
		return service.findById(id);
	}

}
