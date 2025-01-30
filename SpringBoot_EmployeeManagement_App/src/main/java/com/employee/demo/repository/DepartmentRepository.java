package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
