package com.crud.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudent(Long roll) {
		return studentRepository.findById(roll).get();
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
		
	}

	public void deleteStudent(Long roll) {
		studentRepository.deleteById(roll);
	}
}
