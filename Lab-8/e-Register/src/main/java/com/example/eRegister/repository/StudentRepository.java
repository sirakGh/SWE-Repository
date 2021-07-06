package com.example.eRegister.repository;

import com.example.eRegister.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //@Query("select s from Student s where s.studentNumber = ?1")
    Optional<Student> findStudentByStudentNumber(String studentNumber);
}
