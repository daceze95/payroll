package com.example.payroll.service;

import com.example.payroll.dto.SalaryRateDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.model.SalaryRate;

import java.util.List;

public interface SalaryRateService {
    SalaryRate addSalaryRate(SalaryRateDTO e);

    List<SalaryRate> getSalaryRates();

    SalaryRate updateSalaryRateById(SalaryRateDTO d);

    List<Employee> getEmployeeBySalaryRate(Integer rateId);
}
