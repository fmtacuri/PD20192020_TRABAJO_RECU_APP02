package com.distribuida.usuario.util;

import javax.persistence.TypedQuery;

import com.distribuida.usuario.db.Todos;
import com.distribuida.usuario.dto.TodoDto;

public class TodoUtil {

	public TodoDto dto( TypedQuery<Todos> qry ) {
		
		Todos s = qry.getSingleResult();

		TodoDto dto = new TodoDto();

		dto.setId(s.getId());
		dto.setUserId(s.getUserId());
		dto.setTitle(s.getTitle());
		dto.setCompleted(s.getCompleted());

		return dto;
		
	}
	
	
	public Todos s( TodoDto todo ) {
		
		Todos s = new Todos();
		
		s.setId( todo.getId() );
		s.setUserId( todo.getUserId() );
		s.setTitle( todo.getTitle() );
		s.setCompleted( todo.getCompleted() );
		
		return s;
	}
	
	
	
	
	
}
