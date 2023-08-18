package com.example.payroll.repository;

import com.example.payroll.model.EmployeeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCateServiceRepo extends JpaRepository<EmployeeCategory, Integer> {
}
