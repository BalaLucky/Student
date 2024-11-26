package sct.sra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sct.sra.dto.Student;

public interface StudentRepository extends JpaRepository<Student,String>{

}
