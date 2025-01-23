package com.employee.demo.service;

import org.springframework.http.ResponseEntity;

import com.employee.demo.entity.Employee;

public interface EmployeeService {
	
	ResponseEntity<String> addEmployee(Employee employee);
	
}
