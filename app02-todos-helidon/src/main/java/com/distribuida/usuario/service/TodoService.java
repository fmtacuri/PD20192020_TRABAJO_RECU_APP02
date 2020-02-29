package com.distribuida.usuario.service;

import java.util.List;

import com.distribuida.usuario.dto.TodoDto;

public interface TodoService {
	
	//Listo
	public TodoDto findById(Integer id);
	
	// Listo
	public List<TodoDto> findAll( );
}
