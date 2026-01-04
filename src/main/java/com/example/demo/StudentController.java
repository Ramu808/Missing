package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") 
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
	    Student savedStudent = service.saveStudent(student);
	    return ResponseEntity.ok(savedStudent);
	}
	
	@GetMapping("/getstudent/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {
	    Student student = service.getStudent(id);
	    return ResponseEntity.ok(student);
	}


}
