package com.employee.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.demo.entity.Employee;
import com.employee.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public ResponseEntity<String> addEmployee(Employee employee) {

		Employee savedEmployee = employeeRepository.save(employee);

		if (savedEmployee != null)
			return new ResponseEntity<>("Added Successfully", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
