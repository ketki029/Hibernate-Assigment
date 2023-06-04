package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateStudent {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		String name="kiwi";
		Student student=studentService.updateStudent(3, name);
		System.out.println(student.getName());
	}

}
