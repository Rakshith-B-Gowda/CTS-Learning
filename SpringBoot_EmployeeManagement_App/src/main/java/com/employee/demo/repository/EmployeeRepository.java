package com.employee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	@Query("SELECT e FROM Employee e WHERE e.employeeSalary BETWEEN :initialSalary AND :finalSalary ")
//	List<Employee> getAllEmployeeBetweenSalaries(int initialSalary, int finalSalary);
	
	List<Employee> findByEmployeeSalaryBetween(int initialSalary, int finalSalary);
	
	List<Employee> getAllEmployeeByEmployeeDesignation(String employeeDesignation);

}
