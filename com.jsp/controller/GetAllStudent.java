package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetAllStudent {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		List<Student> students= studentService.getAllStudent();
		for(Student s:students) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getC_no());
			System.out.println("=================");
		}
	}

}
