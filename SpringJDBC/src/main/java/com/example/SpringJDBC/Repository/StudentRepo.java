package com.example.SpringJDBC.Repository;

import com.example.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("added");
        // In real implementation, add JDBC logic here to insert 's' into the database
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        // In real implementation, add JDBC logic here to fetch all students from DB
        return students;
    }
}
