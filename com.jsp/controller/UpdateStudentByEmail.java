package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateStudentByEmail {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		Student student=studentService.updateStudentByEmail(3, "kiwi@gmail.com", 636343557l);
		System.out.println(student.getName());
	}

}
