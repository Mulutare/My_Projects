package com.My_project.sm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.My_project.sm.DAO.StudentDAO;
import com.My_project.sm.api.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO StudentDAO;
   
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		List<Student> studentList=StudentDAO.loadStudents();
		
		for(Student tempStudent:studentList) {
			
			System.out.println(tempStudent);
		}
		model.addAttribute("students", studentList);
		 
		return "student-list";
	}
}
