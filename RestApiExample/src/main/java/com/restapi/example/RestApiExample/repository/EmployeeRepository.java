package com.restapi.example.RestApiExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.example.RestApiExample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
