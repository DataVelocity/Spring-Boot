package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Student;


@RestController
public class StudentController {

	//http get request
	
//	@GetMapping("/api")
//	public String activity() {
//		return" Created Restfull web-services using spring MVC";
//	}
//	
	
	@GetMapping("student")
	public Student getStudent() {
		Student student=new Student(1,"Nayan","Suman");
		return student;
	}
 
	@GetMapping("students")
     public List<Student> funStudent(){
    	 List<Student>students=new ArrayList<>();
    	 students.add(new Student(1, "Arun", "Yadav"));
    	 students.add(new Student(2, "Mohan", "Singh"));
    	 students.add(new Student(3, "Rohan", "Pandit"));
    	 students.add(new Student(4, "Sohan", "Raj"));
    	 return students;
     }
	
	@GetMapping("students/{id}/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("id")int studentId,
			                            @PathVariable("firstName") String firstName,
			                            @PathVariable("lastName") String lastName     ) {
		return new Student(studentId,firstName,lastName); 
	}
	
}