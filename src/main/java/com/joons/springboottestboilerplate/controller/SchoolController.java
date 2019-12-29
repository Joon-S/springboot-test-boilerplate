package com.joons.springboottestboilerplate.controller;

import com.joons.springboottestboilerplate.domain.School;
import com.joons.springboottestboilerplate.service.SchoolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public ResponseEntity<List<School>> findAll() {
        List<School> schools = schoolService.findAll();
        return ResponseEntity.ok(schools);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<School> findById(@PathVariable Long id) {
        School school = schoolService.findById(id);
        return ResponseEntity.ok(school);
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody School school) {
        School newSchool = schoolService.save(school);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newSchool.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
