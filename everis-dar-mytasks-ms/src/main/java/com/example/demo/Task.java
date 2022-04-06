package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task{
	
	/**
	 * ID Task unico
	 */
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	/**
	 * Task description
	 */
	private String description;
	
	/**
	 * Task status
	 */
	private String state;
	
	/**
	 * Constructor basic Task
	 */
	public Task(Long ID, String description, String state) {
		
		this.ID = ID;
		this.setDescription(description) ;
		this.setState(state) ;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}

