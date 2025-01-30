package com.employee.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "employees_info")
public class Employee {
	
	@Id
	private Integer employeeId;
	private String employeeName;
	private Integer employeeSalary;
	private String employeeDesignation;
//	@JsonFormat(pattern = "dd-mm-yyyy")
	private Date employeeDoj;
	
	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "departmentId")
	@JsonBackReference
	private Department department;
	
}
