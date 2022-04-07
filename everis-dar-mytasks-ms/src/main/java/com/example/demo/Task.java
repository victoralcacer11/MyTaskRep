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
	public Task() {
		
		super();
		this.description = "";
		this.state = "" ;
	}
	
	
	/**
	 * Constructor with parameters
	 */
	public Task(final Long ID ,final String description,final String state) {
		
		super();
		this.ID = ID;
		this.description = description ;
		this.state = state ;
	}
	
	/**
	 * Task getter
	 * @return description
	 */
	  public Long getID() {
		 return this.ID;
	}
	
	/**
	 * Task getter
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Task getter
	 * @return state
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * Set ID to new task
	 * @param ID new value
	 */
	 public void setID(Long ID) {
		    this.ID = ID;
	}
	
	/**
	 * Set description to new task
	 * @param description new value
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

	/**
	 * Set state to new task 
	 * @param state new value
	 */
	public void setState(String state) {
		this.state = state;
	}
	
}

