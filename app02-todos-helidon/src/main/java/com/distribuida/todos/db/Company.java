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
@Table(name = "company")
public class Company implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Getter @Setter private Integer id;
	
	@Column(name = "name")
	@Getter @Setter private String name;
	
	@Column(name = "catchphrase")
	@Getter @Setter private String catchPhrase;
	
	@Column(name = "bs")
	@Getter @Setter private String bs;

public Company() {
		
	}

}
