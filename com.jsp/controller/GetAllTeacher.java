package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class GetAllTeacher {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		List<Teacher> teachers=teacherService.getAllTeacher();
		for(Teacher t:teachers) {
			System.out.println(t.getId());
			System.out.println(t.getName());
			System.out.println(t.getEmail());
			System.out.println(t.getSubject());
			System.out.println(t.getC_no());
			System.out.println("===================");
			System.out.println();
		}
	}

}
