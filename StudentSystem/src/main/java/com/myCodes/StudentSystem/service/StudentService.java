package com.myCodes.StudentSystem.service;

import java.util.List;

import com.myCodes.StudentSystem.model.Student;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getAllStudents();
}
