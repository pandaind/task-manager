CREATE TABLE task_list(
	task_id BIGINT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	task_name VARCHAR(60),
	task_description  VARCHAR(200),
	task_priority VARCHAR(30),
 	task_status VARCHAR(30),
 	task_archived NUMBER(10)
);