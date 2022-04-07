package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaskController{
	
	@Autowired
	private TaskRepository taskRepository; 
	
/**
 * method of GetMapping to see all the tasks in the BBDD
 * @return List<Task> 
 */
	@GetMapping("/tasks")
	public List<Task> getTask(){
		
		return (List<Task>) this.taskRepository.findAll();
		
		
	}
	
	/**
	 * method of GetMapping to see end tasks
	 * @return List<Task> 
	 */
		@GetMapping("/tasks")
		public List<Task> getTaskEnd(){
			
			List<Task> tasks = (List<Task>)this.taskRepository.findAll();
			
			
			
			 return tasks;
		}




}