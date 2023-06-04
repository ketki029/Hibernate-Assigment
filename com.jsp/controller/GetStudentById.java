package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetStudentById {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		Student student=studentService.getStudentById(2);
		if(student!=null) {
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getC_no());
		}
		else {
			System.out.println("Incorrect id");
		}
	}

}
