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
}
