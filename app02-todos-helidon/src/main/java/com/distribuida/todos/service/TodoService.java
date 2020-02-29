package com.distribuida.todos.service;

import java.util.List;

import com.distribuida.todos.db.Todos;


public interface TodoService {
	
	//Listo
	public Todos findById(Integer id);
	
	// Listo
	public List<Todos> findAll( );
}
