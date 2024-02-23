package com.RESTAPI.RESTAPIdemo.controller;

import com.RESTAPI.RESTAPIdemo.model.Voter;
import com.RESTAPI.RESTAPIdemo.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voters")
public class VoterController {

    @Autowired
    private VoterRepository voterRepository;

    @GetMapping
    public List<Voter> getAllVoters() {
        return voterRepository.findAll();
    }

    @PostMapping
    public Voter createVoter(@RequestBody Voter voter) {
        return voterRepository.save(voter);
    }

    @PutMapping("/{id}")
    public Voter updateVoter(@PathVariable Long id, @RequestBody Voter newVoter) {
        return voterRepository.findById(id)
                .map(voter -> {
                    voter.setName(newVoter.getName());
                    voter.setAge(newVoter.getAge());
                    return voterRepository.save(voter);
                })
                .orElseThrow(() -> new RuntimeException("Voter not found with id " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteVoter(@PathVariable Long id) {
        voterRepository.deleteById(id);
    }
}