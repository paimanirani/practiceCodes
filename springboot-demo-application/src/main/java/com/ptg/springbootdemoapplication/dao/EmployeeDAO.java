package com.ptg.springbootdemoapplication.dao;

import java.util.List;

import com.ptg.springbootdemoapplication.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);

}
