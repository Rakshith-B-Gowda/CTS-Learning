package com.employee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("SELECT e FROM Employee e WHERE e.employeeSalary BETWEEN :initialSalary AND :finalSalary ")
	ResponseEntity<List<Employee>> getAllEmployeeBetweenSalaries(int initialSalary, int finalSalary);

}
