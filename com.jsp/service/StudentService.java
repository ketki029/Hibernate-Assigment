package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	
	StudentDao studentDao=new StudentDao();
	
	//to save
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
		
	}
	
	
	//get by id
	public Student getStudentById(int id) {
		if(id>0) {
			return studentDao.getStudentById(id);
		}
		else {
			return null;
		     }
		 }
	
	
	// delete
	public boolean deleteStudentById(int id) {
		if(id>0) {
			return studentDao.deleteStudentById(id);
			
		}else {
			return false;
		}
	}
	
	
	// get all 
	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
		
	}
	
	
	
	//update 
	public Student updateStudent(int id, String name) {
		Student student= studentDao.getStudentById(id);
		student.setName(name);
		return studentDao.updateStudent(id, student);
		
	}
	
	
	//update email ,cno
	public Student updateStudentByEmail(int id, String email, long c_no) {
		Student student= studentDao.getStudentById(id);
		student.setEmail(email);
		student.setC_no(c_no);
		return studentDao.updateStudent(id, student);
		
	}


}
