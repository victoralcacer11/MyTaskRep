package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class TaskRepositoryTest {
	
	@Autowired
	private TaskRepository taskRepository;
	
	private Task task;
	private final String taskDescription = "Task test";
	private final String taskStatus = "Pending";
	
	@BeforeEach
	public void setUp() {
		this.task = new Task(1L, this.taskDescription, this.taskStatus);
	}
	/**
	 * Method to test save action.
	 */
	@Test
	public void saveTask() {
		final Task newTask = this.taskRepository.save(this.task);
		assertThat(newTask.getDescription())
			.isEqualTo(this.taskDescription);
	}
	
	@Test
	public void removeTask() {
		final Task newTask = this.taskRepository.save(this.task);
		final Boolean isSaved = this.taskRepository.
				existsById(this.task.getID());
		assertThat(isSaved).isTrue();
		this.taskRepository.delete(this.task);
		final Boolean exists = this.taskRepository.
				existsById(this.task.getID());
		assertThat(exists).isFalse();
	}
	
}
