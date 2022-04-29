package com.twitter.user.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class Parag {
	
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String department;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Parag [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
	}
	public Parag(int id, String name, String email, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	public Parag() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
