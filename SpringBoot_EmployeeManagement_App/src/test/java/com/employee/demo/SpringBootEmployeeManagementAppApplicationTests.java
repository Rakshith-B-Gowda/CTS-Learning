package com.employee.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.demo.entity.Department;
import com.employee.demo.entity.Employee;
import com.employee.demo.service.EmployeeService;

@SpringBootTest
class SpringBootEmployeeManagementAppApplicationTests {

	@Autowired
	EmployeeService service;
	
	@Test
	public void testAddEmployee() {
		Department department = new Department(10, "HR Dept", "hr101");
		Employee employee = new Employee(101, "Rakshith", 55000, "admin", new Date(), department );
	}

}
