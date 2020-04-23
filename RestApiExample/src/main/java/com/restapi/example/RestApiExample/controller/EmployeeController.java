package com.restapi.example.RestApiExample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.example.RestApiExample.dao.Employeedao;
import com.restapi.example.RestApiExample.model.Employee;

@Controller

public class EmployeeController {

//	@Autowired
//	Employeedao employeedao;
//	
//	//save an employee	
//	@PostMapping("/employees")
//	public String createEmployee(@Valid @RequestBody Employee emp) {
//		 employeedao.save(emp);
//		 return "Data's Saved Successfully";
//	}
//	
//	//get all employees
//	@GetMapping("/employees")
//	public List<Employee> getAllEmployees(){
//		return employeedao.findAll();
//	}
//	
//	//get employee by particular id
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable (value = "id") Long empid){
//		Employee emp=employeedao.findOne(empid);
//		if(emp==null) {
//        return ResponseEntity.notFound().build();		
//		}
//		
//		return ResponseEntity.ok().body(emp);
//		
//	}
//
//	
//	//update an employee by empid
//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid, @Valid @RequestBody Employee empDetails){
//	
//		Employee emp=employeedao.findOne(empid);
//		if(emp==null) {
//	        return ResponseEntity.notFound().build();		
//	}
//	emp.setName(empDetails.getName());
//	emp.setDesignation(empDetails.getDesignation());
//	emp.setExpertise(empDetails.getExpertise());
//	
//	Employee updateEmployee=employeedao.save(emp);
//	return ResponseEntity.ok().body(updateEmployee);
//	}
//	
////delete an employee
//	@DeleteMapping("/notes/{id}")
//	public ResponseEntity<String> delete(@PathVariable(value="id") Long empid){
//		Employee emp=employeedao.findOne(empid);
//		if(emp==null) {
//	        return ResponseEntity.notFound().build();		
//	}
//		employeedao.delete(empid);
//		return ResponseEntity.ok().body("Deleted Successfully");
//	}
}

