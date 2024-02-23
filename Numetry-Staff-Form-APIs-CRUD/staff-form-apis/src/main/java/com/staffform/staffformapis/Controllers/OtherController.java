package com.staffform.staffformapis.Controllers;

import com.staffform.staffformapis.Models.Other;
import com.staffform.staffformapis.Repositories.OtherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/other")
public class OtherController {

    @Autowired
    private OtherRepository otherRepository;

    @PostMapping
    public ResponseEntity<Other> createOther(@RequestBody Other other) {
        Other savedOther = otherRepository.save(other);
        return new ResponseEntity<>(savedOther, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Other>> getAllOther() {
        List<Other> otherList = otherRepository.findAll();
        return new ResponseEntity<>(otherList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Other> getOtherById(@PathVariable Long id) {
        Optional<Other> otherOptional = otherRepository.findById(id);
        return otherOptional.map(other -> new ResponseEntity<>(other, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Other> updateOther(@PathVariable Long id, @RequestBody Other other) {
        if (!otherRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        other.setId(id);
        Other updatedOther = otherRepository.save(other);
        return new ResponseEntity<>(updatedOther, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOther(@PathVariable Long id) {
        if (!otherRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        otherRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
