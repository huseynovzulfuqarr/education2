package com.education2.controller;

import com.education2.model.University;
import com.education2.repository.UniversityRepository;
import com.education2.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/uni")
@AllArgsConstructor
public class UniversityController {
    private final UniversityService universityService;

    @GetMapping
    public List<University> getAll(){
        return this.universityService
                .getAll();
    }
}
