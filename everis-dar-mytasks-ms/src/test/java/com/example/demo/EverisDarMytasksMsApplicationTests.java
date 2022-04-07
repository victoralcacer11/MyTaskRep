package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class EverisDarMytasksMsApplicationTests {

	@Autowired
	TaskController tcon;
	
	@MockBean
	TaskRepository trepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void addTaskTest() {
		Task testTask = tcon.addTask(buildTask());
		System.out.println(testTask);
	//	assertEquals(testTask,201);
		
	}
	
	
	
	public Task buildTask() {
		Task t= new Task();
		t.setDescription("estoy haciendo el test");
		t.setState("En proceso");
		return t;
		
	}
}
