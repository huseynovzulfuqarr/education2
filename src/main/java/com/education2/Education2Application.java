package com.education2;

import com.education2.model.Address;
import com.education2.model.Student;
import com.education2.model.University;
import com.education2.service.StudentService;
import com.education2.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class Education2Application implements CommandLineRunner {

	private final StudentService studentService;
	private final UniversityService universityService;


	public static void main(String[] args) {
		SpringApplication.run(Education2Application.class, args);
	}

	@Override
	public void run(String... args){
//		University university=new University();
//		university.setId(3);
//		university.setName("Aztu");
//
//		Address address=new Address();
//		address.setId(2);
//		address.setName("Mehdiabad");
//
//		Student student=new Student();
//		//student.setId(4);
//		student.setName("Eltac");
//		student.setSurname("Esedullayev");
//		student.setAge(24);
//		student.setPassword("123");
//		student.setAddress(address);
//		student.setUniversity(university);
//
//		this.studentService.insertStudent(student);


		List<Student> list=this.studentService.getAll();
		for(Student s:list){
			System.out.println(s);
		}
//		List<University> list=this.universityService.getAll();
//		for(University s:list){
//			System.out.println(s);
//
//		}
	}



}
