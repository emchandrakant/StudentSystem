package com.myCodes.StudentSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myCodes.StudentSystem.model.Student;
import com.myCodes.StudentSystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping
	public String add(@RequestBody Student student) {
		service.saveStudent(student);
		return "new student is added: ";
	}
	
	@GetMapping
	public List<Student> getAll(){
		return service.getAllStudents();
	}
	
//	copy is implemented
//	@PostMapping
//	public ResponseEntity<?> add(@RequestBody Student student) {
//		Student student1= service.saveStudent(student);
//		//return "new student is added: "+student1;
//		return new ResponseEntity(student1, HttpStatus.OK);
//	}
}
