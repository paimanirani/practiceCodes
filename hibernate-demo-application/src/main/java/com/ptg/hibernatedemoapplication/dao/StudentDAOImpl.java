package com.ptg.hibernatedemoapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ptg.hibernatedemoapplication.entity.Student;

@Repository
public class StudentDAOImpl {

	private EntityManager entityManager;

	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager; 
	}

	public List<Student> findAll() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Student", Student.class).getResultList();
	}

	public Student save(Student student) {
		Session session = entityManager.unwrap(Session.class);
		session.save(student);
		return student;
	}

}
