package com.jsp.controller;

import com.jsp.service.TeacherService;

public class DeleteTeacherById {
public static void main(String[] args) {
	TeacherService teacherService=new TeacherService();
	boolean flag=teacherService.deleteTeacherById(3);
	if(flag==true) {
		System.out.println("Teacher deleted");
	}else {
		System.out.println("Teacher not deleted");
	}
}
}
