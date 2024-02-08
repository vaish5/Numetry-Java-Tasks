package com.formwithcrud.demo.controller;

import com.formwithcrud.demo.model.Task;
import com.formwithcrud.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/task")
    Task newTask(@RequestBody Task newTask){
        return taskRepository.save(newTask);
    }

    @GetMapping("/tasks")
    List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/task/{id}")
    Optional<Task> getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id);
    }

    @DeleteMapping("/task/{id}")
    void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
}
