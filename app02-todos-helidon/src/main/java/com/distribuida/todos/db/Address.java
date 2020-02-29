package com.distribuida.todos.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
public class Address implements Serializable{

	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Getter @Setter private Integer id;
	
	@Column(name = "street")
	@Getter @Setter private String street;
	
	@Column(name = "suite")
	@Getter @Setter private String suite;
	
	@Column(name = "city")
	@Getter @Setter private String city;
	
	@Column(name = "zipcode")
	@Getter @Setter private String zipcode;
	
	@JoinColumn(name = "geoid", referencedColumnName = "id")
	@ManyToOne
	@Getter @Setter private Geo geoId;

    public Address() {
		
	}
	
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode="
				+ zipcode + ", geoId=" + geoId + "]";
	}

	

}
