package com.studentadmissionform.admissionform.controller;

import com.studentadmissionform.admissionform.model.Student;
import com.studentadmissionform.admissionform.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admissions")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
