package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
