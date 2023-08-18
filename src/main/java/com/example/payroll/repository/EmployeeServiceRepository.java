package com.example.payroll.repository;

import com.example.payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeServiceRepository extends JpaRepository<Employee, Integer> {
}
