package com.restapi.example.RestApiExample.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.restapi.example.RestApiExample.model.Employee;
import com.restapi.example.RestApiExample.repository.EmployeeRepository;

@Service
public class Employeedao {

	@Autowired
	EmployeeRepository employeeRepository;

	// To save an employee
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}

	// search all employees
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	// update an employee
	public Employee update(Employee emp) {
		Optional<Employee> ob = employeeRepository.findById(emp.getId());

		if (ob.isPresent()) {
			Employee newb = ob.get();
			newb.setCreatedAt(emp.getCreatedAt());
			newb.setDesignation(emp.getDesignation());
			newb.setExpertise(emp.getExpertise());
			newb.setName(emp.getName());

			newb = employeeRepository.save(newb);
			return newb;
		} else {
			emp = employeeRepository.save(emp);
			return emp;
		}
	}

	// get an employee by id
	public Employee findOne(Long empid) {
		return employeeRepository.getOne(empid);
	}

	// delete an employee
	public void delete(Long empid) {
		employeeRepository.deleteById(empid);
	}
}
