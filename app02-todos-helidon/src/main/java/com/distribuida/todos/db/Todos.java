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
@Table(name = "todos")
public class Todos implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Getter @Setter private Integer id;
	
	@Column(name = "name")
	@Getter @Setter private String name;
	
	@Column(name = "username")
	@Getter @Setter private String userName;
	
	@Column(name = "email")
	@Getter @Setter private String email;
	
	@Column(name = "phone")
	@Getter @Setter private String phone;
	
	@Column(name = "website")
	@Getter @Setter private String website;
	
	
	
	@JoinColumn(name = "addressid", referencedColumnName = "id")
	@ManyToOne
	@Getter @Setter private Address addressId;
	
	@JoinColumn(name = "companyid", referencedColumnName = "id")
	@ManyToOne
	@Getter @Setter private Company companyId;

	
public Todos() {
		
	}
	
	@Override
	public String toString() {
		return "Todos [id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", phone=" + phone
				+ ", website=" + website + ", addressId=" + addressId + ", companyId=" + companyId + "]";
	}

	

	
	
	
}
