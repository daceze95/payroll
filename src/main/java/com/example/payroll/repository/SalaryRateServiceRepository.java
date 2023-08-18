package com.example.payroll.repository;

import com.example.payroll.model.SalaryRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRateServiceRepository extends JpaRepository<SalaryRate, Integer> {
}
