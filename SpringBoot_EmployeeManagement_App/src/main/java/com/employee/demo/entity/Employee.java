package com.employee.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employees_info")
public class Employee {
	
	@Id
	private Integer employeeId;
	private String employeeName;
	private Integer employeeSalary;
	private String employeeDesignation;
	@JsonFormat(pattern = "dd-mm-yyyy")
	private Date employeeDoj;
	
}
