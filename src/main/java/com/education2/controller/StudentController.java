package com.education2.controller;

import com.education2.model.Student;
import com.education2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/edu")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return this.studentService.getAll();
    }
    @PostMapping("/post")
    public Student insertStudents(Student student){
        return this.studentService.insertStudent(student);
    }

}
