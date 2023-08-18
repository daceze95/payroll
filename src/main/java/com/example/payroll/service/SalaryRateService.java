package com.example.payroll.service;

import com.example.payroll.model.Employee;
import com.example.payroll.model.SalaryRate;

import java.util.List;

public interface SalaryRateService {
    SalaryRate addSalaryRate(SalaryRate e);

    List<SalaryRate> getSalaryRates();

    SalaryRate updateSalaryRateById(SalaryRate d);

    List<Employee> getEmployeeBySalaryRate(Integer rateId);
}
