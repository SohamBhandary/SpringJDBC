package com.example.SpringJDBC;

import com.example.SpringJDBC.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(SpringJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setName("Soham");
		s.setMarks(68);
		s.setRollNo(36);
		addStudent(s);


	}

}
