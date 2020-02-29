package com.distribuida.usuario.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.distribuida.usuario.db.Todos;
import com.distribuida.usuario.dto.TodoDto;
import com.distribuida.usuario.util.TodoUtil;

@ApplicationScoped
@Transactional
public class TodoServiceImpl implements TodoService {

	@PersistenceContext
	private EntityManager em;

	@Inject
	TodoUtil utilTodo;

	@Override
	public TodoDto findById(Integer id) {

		TypedQuery<Todos> qry = em.createQuery("select o from Todos o where o.userId=:id", Todos.class);
		qry.setParameter("id", id);

		TodoDto dto = utilTodo.dto(qry);

		return dto;
	}

	@Override
	public List<TodoDto> findAll() {
		TypedQuery<Todos> qry = em.createQuery("select o from Todos o order by o.id asc", Todos.class);

		List<TodoDto> ret = qry.getResultList().stream().map(s -> {
			TodoDto dto = new TodoDto();

			dto.setId(s.getId());
			dto.setUserId(s.getUserId());
			dto.setTitle(s.getTitle());
			dto.setCompleted(s.getCompleted());

			return dto;
		}).collect(Collectors.toList());

		return ret;
	}

}
