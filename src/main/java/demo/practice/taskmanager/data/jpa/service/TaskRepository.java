package demo.practice.taskmanager.data.jpa.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import demo.practice.taskmanager.data.jpa.domain.Task;


public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);

	List<Task> findByTaskStatus(@Param("status") String taskStatus);
}