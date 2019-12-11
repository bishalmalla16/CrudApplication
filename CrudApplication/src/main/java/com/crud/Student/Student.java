package com.crud.Student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long roll;		//Primary key
	
	private String name;
	private String address;
	private String email;
	
	
	public Student() {
		
	}
	
	public Student(Long roll, String name, String address, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public Long getRoll() {
		return roll;
	}
	public void setRoll(Long roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
