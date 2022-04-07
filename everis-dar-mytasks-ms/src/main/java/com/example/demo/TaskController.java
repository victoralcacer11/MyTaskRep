package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaskController{
	
	@Autowired
	private TaskRepository taskRepository; 
	
/**
 * 
 * @return 
 */
	@GetMapping("/tasks")
	public List<Task> getTask(){
		
		return (List<Task>) this.taskRepository.findAll();
		
		
	}
	
}