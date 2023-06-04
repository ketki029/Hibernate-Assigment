package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class UpdateTeacherEmail {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		Teacher teacher=teacherService.updateTeacherByEmail(1, "swayam@gmail.com", "SQL");
		System.out.println(teacher.getName());
	}

}
