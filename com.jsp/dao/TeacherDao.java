package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Ketki");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	// save Teacher
	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	
	
   //get by id
	public Teacher getTeacherById(int id) {
		return entityManager.find(Teacher.class, id);
	}
	
	
	//delete
	public boolean deleteTeacherById(int id) {
		Teacher teacher=entityManager.find(Teacher.class,id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;
	}
	
	
	//get all teacher
	public List<Teacher> getAllTeacher(){
		String jpql="SELECT t FROM Teacher t";
		Query query=entityManager.createQuery(jpql);
		List<Teacher> teachers=query.getResultList();
		return teachers;
		
	}
	
	
	//update Teacher
	public Teacher updateTeacher(int id , Teacher teacher) {
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}else {
			return null;
		}
	}
	
	
	// update email subject
	public Teacher updateTeacherByEmail(int id , Teacher teacher) {
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}else {
			return null;
		}
	}
 
}
