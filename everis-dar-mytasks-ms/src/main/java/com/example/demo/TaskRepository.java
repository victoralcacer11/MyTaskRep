package com.example.demo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CrudRepository for manage web request
 * @author valcacer
 *
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
	
}