package com.example.SpringJDBC.Repository;

import com.example.SpringJDBC.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private final JdbcTemplate jdbc;

    public StudentRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "INSERT INTO student (roll, name, marks) VALUES (?, ?, ?)";
      int update=  jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(update +"effected");
    }

    public List<Student> findAll() {
      String sql = "select * from student";
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("roll"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
     return jdbc.query(sql,mapper);

    }
}
