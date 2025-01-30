package com.employee.demo.service;

import java.util.List;

import com.employee.demo.entity.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);

	List<Department> getAllDepartments();
}
