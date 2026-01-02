package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
	    Student savedStudent = service.saveStudent(student);
	    return ResponseEntity.ok(savedStudent);
	}
}
