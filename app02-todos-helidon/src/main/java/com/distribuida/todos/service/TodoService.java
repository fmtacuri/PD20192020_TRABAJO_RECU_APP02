package com.distribuida.todos.service;

import java.util.List;

import com.distribuida.todos.dto.TodoDto;

public interface TodoService {
	
	//Listo
	public TodoDto findById(Integer id);
	
	// Listo
	public List<TodoDto> findAll( );
}
