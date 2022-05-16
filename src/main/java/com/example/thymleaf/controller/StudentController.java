package com.example.thymleaf.controller;

import com.example.thymleaf.service.StudentServiceImpl;
import com.example.thymleaf.service.StudentServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
    private StudentServiceInterface studentRepository;

    public StudentController(StudentServiceInterface studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/Students")
    public String listStudents(Model model){
model.addAttribute("students",studentRepository.getAllStudent());
return "students";
    }

}
