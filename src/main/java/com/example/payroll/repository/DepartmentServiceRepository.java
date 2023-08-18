package com.example.payroll.repository;

import com.example.payroll.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentServiceRepository extends JpaRepository<Department, Integer> {
}
