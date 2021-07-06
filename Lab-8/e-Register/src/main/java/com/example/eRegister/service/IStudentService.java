package com.example.eRegister.service;

import com.example.eRegister.Student.Student;

import java.util.Optional;


public interface IStudentService {
    Iterable<Student> getAllStudents();
    Student save(Student s);
    Student findStudentById(Long id);
    void deleteStudent(Student id);
    Optional<Student> findStudentByStudentNumber(String num);
}
