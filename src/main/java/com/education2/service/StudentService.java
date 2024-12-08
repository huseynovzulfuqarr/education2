package com.education2.service;

import com.education2.model.Student;
import com.education2.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAll(){
        return this.studentRepository.findAll();
    }

    public Student insertStudent(Student student){
        return this.studentRepository.save(student);
    }
}
