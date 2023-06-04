package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class SaveStudent {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	Student student=new Student();
	
	student.setName("madhuri");
	student.setEmail("madhuri@gmail.com");
	student.setC_no(653453543l);
	
	Student s2=studentService.saveStudent(student);
	if(s2!=null) {
		System.out.println("Student saved");
	}
}
}
