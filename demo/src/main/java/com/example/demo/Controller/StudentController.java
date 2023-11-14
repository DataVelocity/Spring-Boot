package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Student;
//import org.springframework.http.HttpStatus;


@RestController
public class StudentController {

	//http get request
	
//	@GetMapping("/api")
//	public String activity() {
//		return" Created Restfull web-services using spring MVC";
//	}
//	
	
	@GetMapping("fun")
	public Student getStudent() {
		Student student=new Student(1,"Nayan","Suman");
		return student;
	}
 
	@GetMapping("activitiy")
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
	
	@PostMapping("activity/create")
//	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent( @RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return student;
	}
	
	@PutMapping("activity/{id}/update")
	public Student updateStudent( @RequestBody Student student, @PathVariable("id") int studentId) {
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return student;
	}
	
	@DeleteMapping("activity/{id}/delete")
	public String deleteStudent( @PathVariable("id") int studentId) {
		System.out.println(studentId);
		
		return "Student Id Delete Successfully";
	}
	
}