package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Student saveStudent(Student student) {
		
		Student save=repo.save(student);
		return save;
		
	}

	
	public Student getStudent(Long id) {
	    return repo.findById(id)
	               .orElseThrow(() -> new RuntimeException("Student not found"));
	}

}
