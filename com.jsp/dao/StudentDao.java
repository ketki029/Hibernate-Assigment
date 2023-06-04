package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Ketki");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	//to save Students
	
	public Student saveStudent(Student student) {
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	
	//get student by id
	
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
		
	}
	
	
	//delete student
	
	public boolean deleteStudentById(int id) {
		Student student=entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
	}
	
	
	// get all student
	
	public List<Student> getAllStudent(){
		String jpql="SELECT s FROM Student s";
		Query query=entityManager.createQuery(jpql);
		List<Student> students=query.getResultList();
		return students;
		
	}
	
	
	//update student
	public Student updateStudent(int id, Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}else {
			return null;
		}
		
	}
	
	
	//update email ,cno
	public Student updateStudentByEmail(int id, Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}else {
			return null;
		}
		
	}

}
