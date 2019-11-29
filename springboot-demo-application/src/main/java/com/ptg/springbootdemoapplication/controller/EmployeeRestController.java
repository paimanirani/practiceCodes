package com.ptg.springbootdemoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ptg.springbootdemoapplication.entity.Employee;
import com.ptg.springbootdemoapplication.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();

	}

	@GetMapping("/employees/employee/{id}")
	public Employee employeeById(@PathVariable int id) {
		Employee employee = employeeService.findById(id);
		if (employee == null) {
			throw new RuntimeException("Unexpected error while fetching employeeById");
		}
		return employee;
	}

	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee) {
		if (employee == null) {
			throw new RuntimeException("Unexpected error while saving Employee");
		}
		// just in case an id is passed in json.... set the id to 0
		// this is to force a save of new item.. instead of update
		employee.setId(0);
		employeeService.save(employee);

		return employee;
	}

	@PutMapping("/employees")
	public Employee update(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}

	@DeleteMapping("/employees/employee/{id}")
	public Employee deleteById(@PathVariable int id) {
		Employee employee = employeeService.findById(id);
		if (employee == null) {
			throw new RuntimeException("No employee with id: " + id);
		}
		employeeService.deleteById(id);
		return employee;
	}

}
