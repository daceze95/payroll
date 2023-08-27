package com.example.payroll.service.implementation;

import com.example.payroll.dto.SalaryRateDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.model.EmployeeCategory;
import com.example.payroll.model.SalaryRate;
import com.example.payroll.repository.EmployeeCateServiceRepo;
import com.example.payroll.repository.EmployeeServiceRepository;
import com.example.payroll.repository.SalaryRateServiceRepository;
import com.example.payroll.service.SalaryRateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryRateRepoImpl implements SalaryRateService {


    private final SalaryRateServiceRepository salaryRateServiceRepository;
    private final EmployeeCateServiceRepo employeeCateServiceRepo;
    private final EmployeeServiceRepository employeeServiceRepository;

    public SalaryRateRepoImpl(SalaryRateServiceRepository salaryRateServiceRepository, EmployeeCateServiceRepo employeeCateServiceRepo, EmployeeServiceRepository employeeServiceRepository) {
        this.salaryRateServiceRepository = salaryRateServiceRepository;
        this.employeeCateServiceRepo = employeeCateServiceRepo;
        this.employeeServiceRepository = employeeServiceRepository;
    }

    @Override
    public SalaryRate addSalaryRate(SalaryRateDTO e) {
        SalaryRate SRSchema = new SalaryRate();
        EmployeeCategory isExist = employeeCateServiceRepo.findById(e.getEmployeeCategory()).orElse(null);

        if(isExist != null){
            SRSchema.setId(e.getId());
            SRSchema.setEmployeeCategory(isExist);
            SRSchema.setLevel(e.getLevel());
            SRSchema.setAmount(e.getAmount());
            return salaryRateServiceRepository.save(SRSchema);
        }
        return null;
    }

    @Override
    public List<SalaryRate> getSalaryRates() {
        return salaryRateServiceRepository.findAll();
    }

    @Override
    public SalaryRate updateSalaryRateById(SalaryRateDTO sr) {
        SalaryRate sRate = salaryRateServiceRepository.findById(sr.getId()).orElse(null);
        EmployeeCategory empCate = employeeCateServiceRepo.findById(sr.getEmployeeCategory()).orElse(null);
        if(sRate != null && empCate != null){
            sRate.setId(sr.getId());
            sRate.setLevel(sr.getLevel());
            sRate.setEmployeeCategory(empCate);
            sRate.setAmount(sr.getAmount());
            return salaryRateServiceRepository.save(sRate);
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeBySalaryRate(Integer rateId) {
        return null;
    }
}
