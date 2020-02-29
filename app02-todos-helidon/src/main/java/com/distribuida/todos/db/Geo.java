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
@Table(name = "geo")
public class Geo implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Getter @Setter private Integer id;
	
	@Column(name = "lat")
	@Getter @Setter private String lat;
	
	@Column(name = "lng")
	@Getter @Setter private String lng;

	
    public Geo() {
		
	}

	@Override
	public String toString() {
		return "Geo [id=" + id + ", lat=" + lat + ", lng=" + lng + "]";
	}

	
	
}
