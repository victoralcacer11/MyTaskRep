/**
 * 
 */
package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author valcacer
 *
 */
@ExtendWith(MockitoExtension.class)
public class TaskControllerTest {
	
	private MockMvc mvc;
	/**
	 * controller to tst
	 */
	@InjectMocks
	private TaskController taskController;
	/**
	 * 
	 */
	@Mock
	private TaskRepository taskRepository;
	/**
	 * task object to use in the test
	 * Task properties to test
	 */
	private Task task;
	private String taskDescription = "Task test";
	private String taskState = "Iniciada";
	
	/**
	 * Method lunch before @test
	 * this create a task and buid
	 */
	@BeforeEach
	public void setUp() {
		this.task = new Task();
		this.task.setDescription(taskDescription);
		this.task.setState(taskState);
		;
		
	}
	
	
	

}
