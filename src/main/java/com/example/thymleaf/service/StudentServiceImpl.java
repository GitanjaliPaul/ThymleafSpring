package com.example.thymleaf.service;

import com.example.thymleaf.entity.Student;
import com.example.thymleaf.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentServiceInterface {
private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public  List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
