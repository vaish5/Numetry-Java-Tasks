package com.staffform.staffformapis.Controllers;

import com.staffform.staffformapis.Models.Personal;
import com.staffform.staffformapis.Repositories.PersonalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {

    private PersonalRepository personalRepository;

    @PostMapping
    public ResponseEntity<Personal> createPersonal(@RequestBody Personal personal) {
        Personal savedPersonal = personalRepository.save(personal);
        return new ResponseEntity<>(savedPersonal, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Personal>> getAllPersonal() {
        List<Personal> personalList = personalRepository.findAll();
        return new ResponseEntity<>(personalList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personal> getPersonalById(@PathVariable Long id) {
        Optional<Personal> personalOptional = personalRepository.findById(id);
        return personalOptional.map(personal -> new ResponseEntity<>(personal, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personal> updatePersonal(@PathVariable Long id, @RequestBody Personal personal) {
        if (!personalRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        personal.setId(id);
        Personal updatedPersonal = personalRepository.save(personal);
        return new ResponseEntity<>(updatedPersonal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonal(@PathVariable Long id) {
        if (!personalRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        personalRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
