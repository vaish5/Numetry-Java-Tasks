package com.formwithcrud.demo.repository;

import com.formwithcrud.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
