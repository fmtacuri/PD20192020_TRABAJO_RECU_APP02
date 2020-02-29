package com.distribuida.usuario.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "Todos" )
public class Todos {
	
	@Id
	@Column(name="id")
	@Getter @Setter private Integer id;
	
	@Column(name="userId")
	@Getter @Setter private Integer userId;

	@Column(name="title")
	@Getter @Setter private String title;
	
	@Column(name="completed")
	@Getter @Setter private String completed;
	
}
