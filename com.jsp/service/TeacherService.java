package com.jsp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao=new TeacherDao();
	
	
	//save
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
		}
	
	//get by id
	public Teacher getTeacherById(int id) {
		if(id>0) {
			return teacherDao.getTeacherById(id);
			}
		else {
			return null;
		}
	}
	
	
	//delete
	public boolean deleteTeacherById(int id) {
		if(id>0) {
			return teacherDao.deleteTeacherById(id);
			}
		else {
			return false;
		}
	}
	
	
	// get all teacher
	public List<Teacher> getAllTeacher(){
		return teacherDao.getAllTeacher();
	}
	
	
	
	//update
	public Teacher updateTeacher(int id , String name) {
		Teacher teacher=teacherDao.getTeacherById(id);
		teacher.setName(name);
		return teacherDao.updateTeacher(id, teacher);
	}
	
	
	//update email subject
	public Teacher updateTeacherByEmail(int id , String email, String subject) {
		Teacher teacher=teacherDao.getTeacherById(id);
		teacher.setEmail(email);
		teacher.setSubject(subject);
		return teacherDao.updateTeacherByEmail(id, teacher);
	}

}
