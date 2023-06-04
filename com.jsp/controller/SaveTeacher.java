package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class SaveTeacher {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
	    Teacher teacher=new Teacher();
	    teacher.setName("nuthan");
	    teacher.setEmail("nuthan@gmail.com");
	    teacher.setC_no(887689734l);
	    teacher.setSubject("JAVA");
	    
	    Teacher t2=teacherService.saveTeacher(teacher);
	    if(t2!=null) {
	    	System.out.println("Teacher saved");
	    }
	}
}
