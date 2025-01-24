package com.employee.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.demo.entity.Employee;
import com.employee.demo.exceptions.EmployeeNotFound;
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

	@Override
	public ResponseEntity<?> updateEmployee(Employee updatedEmployee) {
		Employee savedEmployee = employeeRepository.save(updatedEmployee);

		if (savedEmployee != null)
			return new ResponseEntity<>("Added Successfully", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@Override
	public ResponseEntity<String> deleteEmployee(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
		return new ResponseEntity<String>("Deleted Successfully!", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Employee>> allEmployee() {
		return new ResponseEntity<List<Employee>>(employeeRepository.findAll(), HttpStatus.OK) ;
	}

	@Override
	public ResponseEntity<Employee> getEmployeeById(Integer employeeId) throws EmployeeNotFound {
		Optional<Employee> optional = employeeRepository.findById(employeeId);
		if (optional.isPresent()) {
			return new ResponseEntity<Employee>(optional.get(), HttpStatus.OK);
		} else {
			throw new EmployeeNotFound("No Employee found with ID "+employeeId);
		}
		
	}

	@Override
	public ResponseEntity<List<Employee>> getAllEmployeeBetweenSalaries(int initialSalary, int finalSalary) {
		List<Employee> employees = employeeRepository.findByEmployeeSalaryBetween(initialSalary,finalSalary);
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Employee>> getAllByDesignation(String employeeDesignation) {
		List<Employee> emplopyees = employeeRepository.getAllEmployeeByEmployeeDesignation(employeeDesignation);
		return new ResponseEntity<List<Employee>>(emplopyees, HttpStatus.OK);
	}


	
}
