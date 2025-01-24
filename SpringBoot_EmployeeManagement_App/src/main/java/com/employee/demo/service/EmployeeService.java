package com.employee.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.employee.demo.entity.Employee;
import com.employee.demo.exceptions.EmployeeNotFound;

public interface EmployeeService {

	ResponseEntity<String> addEmployee(Employee employee);

	ResponseEntity<?> updateEmployee(Employee employee);

	ResponseEntity<String> deleteEmployee(Integer employeeId);

	ResponseEntity<List<Employee>> allEmployee();

	ResponseEntity<Employee> getEmployeeById(Integer employeeId) throws EmployeeNotFound;

	ResponseEntity<List<Employee>> getAllEmployeeBetweenSalaries(int initialSalary, int finalSalary);
	
	ResponseEntity<List<Employee>> getAllByDesignation(String employeeDesignation);


}
