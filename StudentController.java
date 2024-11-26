package sct.sra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import sct.sra.dto.Student;
import sct.sra.repository.StudentRepository;
import sct.sra.service.StudentService;

public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping(value="/students")
	public Student createStudents(@RequestBody Student students) {
		return StudentService.save(students);
	}
	p
	

}
