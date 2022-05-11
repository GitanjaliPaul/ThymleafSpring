package com.example.thymleaf;

import com.example.thymleaf.entity.Student;
import com.example.thymleaf.repository.StudentRepository;
import com.example.thymleaf.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
Student student1=new Student("ramesh","yadav","yahe34@gmail.com");
		studentRepository.save(student1);
	}
}

