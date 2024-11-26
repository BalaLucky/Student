package sct.sra.service;

import org.springframework.beans.factory.annotation.Autowired;

import sct.sra.dto.Student;
import sct.sra.repository.StudentRepository;

public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	public Student registerStudent(Student student) {
		if
		(studentRepository.findByUsername(student.getUsername(student.getName()).isPresent()))
	}
	
	

}
