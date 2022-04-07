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
	 * method of GetMapping to see a task
	 * @param id
	 * @return de task with this param
	 */
	@GetMapping("/taskId")
	public Optional<Task> getTaskId(@RequestParam (value="id") Long id){
		
		return this.taskRepository.findById(id);
		
	}
	
	/**
	 * Metod for see the complet tasks
	 * equalsIgnoreCase("Finalizada") accept status Finalizada and finalizada and FINALIZADA
	 * @return List<Task> tasksEnd
	 */
	@GetMapping("/tasksEnd")
	public List<Task> getTaskEnd(){
			
		List<Task> tasks = (List<Task>)this.taskRepository.findAll();
		List<Task> tasksEnd = new ArrayList<Task>();
		for (int i =0 ; i < tasks.size() ; i++ ) {
			
			if(tasks.get(i).getState().equalsIgnoreCase("Finalizada")) {
				tasksEnd.add(tasks.get(i));
			}
		}	
			
	    return tasksEnd;
	}




}