package com.distribuida.todos.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todos")
public class Todos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "todosId")
	@Getter @Setter private Integer todosId;
	
	@Column(name = "id")
	@Getter @Setter private Integer id;
	
	@Column(name = "title")
	@Getter @Setter private String title;
	
	@Column(name = "completed")
	@Getter @Setter private String completed;
	

public Todos() {
		
	}


@Override
public String toString() {
	return "Todos [id=" + id + ", todosId=" + todosId + ", title=" + title + ", completed=" + completed + "]";
}
	

}
