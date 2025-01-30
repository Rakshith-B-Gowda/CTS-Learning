package com.employee.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.Department;
import com.employee.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/dept")
@AllArgsConstructor
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/allDepartments")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

}
