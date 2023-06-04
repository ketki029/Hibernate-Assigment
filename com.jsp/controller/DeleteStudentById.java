package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class DeleteStudentById {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		boolean flag= studentService.deleteStudentById(2);
		if(flag==true) {
			System.out.println("Student Deleted");
		}else {
			System.out.println("Student not deleted");
		}
	}

}
