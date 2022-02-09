package com.empolyee.crud.entities;

import javax.persistence.Entity;

@Entity
public class Student {
	private  long id;
	private String name;
	private String  school;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
