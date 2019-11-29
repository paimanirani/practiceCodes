package com.ptg.springbootdemoapplication.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptg.springbootdemoapplication.dao.EmployeeDAO;
import com.ptg.springbootdemoapplication.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDao.save(employee);

	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDao.deleteById(id);

	}

}
