package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class GetTeacherById {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		Teacher teacher=teacherService.getTeacherById(2);
		if(teacher!=null) {
			System.out.println(teacher.getName());
			System.out.println(teacher.getEmail());
			System.out.println(teacher.getSubject()); 
			System.out.println(teacher.getC_no());
			}
		else {
			System.out.println("Incorrect id");
		}
	}


}
