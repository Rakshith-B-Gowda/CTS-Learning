package com.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.Employee;
import com.employee.demo.exceptions.EmployeeNotFound;
import com.employee.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String greet() {
		return "Hello World!";
	}

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> allEmployee() {
		return employeeService.allEmployee();
	}

	@GetMapping("/getById/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer employeeId) throws EmployeeNotFound {
		return employeeService.getEmployeeById(employeeId);
	}

	@GetMapping("/getBetweenSal")
	public ResponseEntity<List<Employee>> getAllEmployeeBetweenSalaries(
			@RequestParam int initialSalary, @RequestParam int finalSalary) 
	{
		return employeeService.getAllEmployeeBetweenSalaries(initialSalary, finalSalary);
	}
	
	@GetMapping("/getByDesg/{employeeDesignation}")
	public ResponseEntity<List<Employee>> getAllByDesignation(@PathVariable String employeeDesignation) {
		return employeeService.getAllByDesignation(employeeDesignation);
	}

}
