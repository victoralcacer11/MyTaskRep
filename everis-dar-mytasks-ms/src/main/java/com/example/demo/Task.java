package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task{
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String description;
	private String status;
	
	public Task() {
		this.description = '' ;
		this.status = '' ;
	}
	
}

