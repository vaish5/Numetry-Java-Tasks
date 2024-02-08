package com.example.todolist.controller;

import com.example.todolist.model.ToDo;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping
    public List<ToDo> getAllTodos() {
        return toDoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ToDo> getTodoById(@PathVariable Long id) {
        return toDoRepository.findById(id);
    }

    @PostMapping
    public ToDo addTodo(@RequestBody ToDo todo) {
        return toDoRepository.save(todo);
    }

    @PutMapping("/{id}")
    public ToDo editTodo(@PathVariable Long id, @RequestBody ToDo updatedTodo) {
        ToDo existingTodo = toDoRepository.findById(id).orElse(null);

        if (existingTodo != null) {
            existingTodo.setTitle(updatedTodo.getTitle());
            existingTodo.setDescription(updatedTodo.getDescription());
            existingTodo.setStatus(updatedTodo.getStatus());
            existingTodo.setDate(updatedTodo.getDate());

            return toDoRepository.save(existingTodo);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        toDoRepository.deleteById(id);
    }
}
