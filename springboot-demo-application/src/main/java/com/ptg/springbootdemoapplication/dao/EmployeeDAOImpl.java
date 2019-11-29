package com.ptg.springbootdemoapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ptg.springbootdemoapplication.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		Session myCurrentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = myCurrentSession.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee findById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Employee.class, id);
	}

	@Override
	public void save(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);

	}

	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);
		 session.delete(session.get(Employee.class, id));
//		Query query = session.createQuery("delete from Employee where id=:employeeId");
//		query.setParameter("employeeId", id);
//		query.executeUpdate();

	}

}
