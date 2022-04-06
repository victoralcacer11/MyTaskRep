package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * CrudRepository for manage web request
 * @author valcacer
 *
 */

public interface TaskRepository extends CrudRepository<Task, Long> {
	
	/**
	 * make a list by description task
	 * @param description
	 * @return
	 */
  	List<Task> findByDescription(String description);
}