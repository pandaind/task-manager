package demo.practice.taskmanager.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task_list")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
	private int id;

	@Column(name = "task_name")
	private String taskName;

	@Column(name = "task_description")
	private String taskDescription;

	@Column(name = "task_priority")
	private String taskPriority;

	@Column(name = "task_status")
	private String taskStatus;

	@Column(name = "task_archived")
	private int taskArchived = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public int isTaskArchived() {
		return taskArchived;
	}

	public void setTaskArchived(int taskArchived) {
		this.taskArchived = taskArchived;
	}
	
	public Task() {
	}

	public Task(String taskName, String taskDescription, String taskPriority, String taskStatus,
			int taskArchived) {
		super();
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskPriority = taskPriority;
		this.taskStatus = taskStatus;
		this.taskArchived = taskArchived;
	}

	@Override
	public String toString() {
		return "Task[id=" + this.id + ", name=" + this.taskName + ", description=" + this.taskDescription
				+ ", priority=" + this.taskPriority + ", status=" + this.taskStatus + "]";
	}

}
