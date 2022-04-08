/**
 * 
 */
package com.example.demo;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;


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
		this.task.setDescription(this.taskDescription);
		this.task.setState(this.taskState);
		JacksonTester.initFields(this, new ObjectMapper());
		this.mvc = MockMvcBuilders.standaloneSetup(this.taskController).build();
		
	}
	
	@Test
	public void getTasks() throws Exception{
		final List<Task> tasks = new ArrayList<Task>();
		tasks.add(this.task);
		
		//given
		given(this.taskRepository.findAll()).willReturn(tasks);
		
		//find at least one element
		this.mvc.perform(MockMvcRequestBuilders
						.get("/tasks")
						.accept(MediaTypes.ALPS_JSON))
						.andDo(print())
						.andExpect(status().isOk())
						.andExpectAll(MockMvcResultMatchers.jsonPath("$..description").exists());
		
		
	}
	
	
	

}
