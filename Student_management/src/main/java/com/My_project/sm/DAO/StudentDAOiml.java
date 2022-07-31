
package com.My_project.sm.DAO;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.My_project.sm.api.Student;
import com.My_project.sm.rowmapper.StudentRowMapper;
@Repository
public class StudentDAOiml implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Student> loadStudents() {

		String sql="select * from My_project.students";
		List<Student> theListOfStudents= jdbctemplate.query(sql, new StudentRowMapper());

		return theListOfStudents;
	}

}
