package com.distribuida.todos.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.distribuida.todos.db.Todos;

@ApplicationScoped
@Transactional
public class TodoServiceImpl implements TodoService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Todos findById(Integer id) {
		Todos todos = em.find(Todos.class, id);
		return todos;
	}

	@Override
	public List<Todos> findAll() {
		TypedQuery<Todos> query = em.createQuery("Select o from Todos o", Todos.class);
		List<Todos> todos = query.getResultList();
		return todos;

	}

}
