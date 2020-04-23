package com.restapi.example.RestApiExample.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.restapi.example.RestApiExample.dao.Employeedao;
import com.restapi.example.RestApiExample.model.Employee;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin("http:localhost:4200")
public class RestController {

	@Autowired
	Employeedao service;
	
	private static Logger logger=Logger.getLogger(RestController.class);
	
	
	@GetMapping("/employees")
	public List<Employee> getAll() {
		logger.debug("Getting all Employees");
		return service.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable(value="id") Long id) {
		logger.debug("Getting an Employee "+id);
		return service.findOne(id);
	}
	
	@PostMapping("/employees")
	public Employee insert(@RequestBody Employee emp) {
		logger.debug("Posting an Employee "+emp.getId());
		return service.save(emp);
	}
	
	@PutMapping("/employee/{id}")
	public Employee update(@PathVariable(value="id") Long id,@RequestBody Employee emp) {
		logger.debug("Updating an Employee " +id);
		return service.update(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable(value="id") Long id) {
		logger.debug("Deleting an Employee " +id);
		service.delete(id);
	}
	
}
