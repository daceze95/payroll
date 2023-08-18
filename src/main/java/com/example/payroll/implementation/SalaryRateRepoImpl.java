package com.example.payroll.implementation;

import com.example.payroll.model.Employee;
import com.example.payroll.model.SalaryRate;
import com.example.payroll.repository.SalaryRateServiceRepository;
import com.example.payroll.service.SalaryRateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryRateRepoImpl implements SalaryRateService {


    private final SalaryRateServiceRepository salaryRateServiceRepository;

    public SalaryRateRepoImpl(SalaryRateServiceRepository salaryRateServiceRepository) {
        this.salaryRateServiceRepository = salaryRateServiceRepository;
    }

    @Override
    public SalaryRate addSalaryRate(SalaryRate e) {

        return salaryRateServiceRepository.save(e);
    }

    @Override
    public List<SalaryRate> getSalaryRates() {
        return salaryRateServiceRepository.findAll();
    }

    @Override
    public SalaryRate updateSalaryRateById(SalaryRate sr) {

        return salaryRateServiceRepository.save(sr);
    }

    @Override
    public List<Employee> getEmployeeBySalaryRate(Integer rateId) {
        return null;
    }
}
