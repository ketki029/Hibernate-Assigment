package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class UpdateTeacher {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		String name="swayam";
		Teacher teacher=teacherService.updateTeacher(1, name);
		System.out.println(teacher.getName());
	 
	}

}
