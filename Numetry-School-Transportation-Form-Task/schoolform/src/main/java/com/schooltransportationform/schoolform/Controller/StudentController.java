package com.schooltransportationform.schoolform.Controller;

import com.schooltransportationform.schoolform.Entity.Student;
import com.schooltransportationform.schoolform.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/submitForm")
    public ResponseEntity<String> submitForm(@RequestBody Student formData) {
        try {
            // Save form data to MySQL database
            studentRepository.save(formData);
            return ResponseEntity.ok("Hi " + formData.getStudentName() + ", form successfully submitted. Thank you");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while submitting the form.");
        }
    }
}
