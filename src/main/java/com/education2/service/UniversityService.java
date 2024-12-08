package com.education2.service;

import com.education2.model.University;
import com.education2.repository.UniversityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversityService {
    private final UniversityRepository universityRepository;

    public List<University> getAll(){
        return this.universityRepository.findAll();
    }
}
