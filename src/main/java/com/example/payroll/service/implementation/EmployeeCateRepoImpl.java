package com.example.payroll.service.implementation;

import com.example.payroll.model.EmployeeCategory;
import com.example.payroll.repository.EmployeeCateServiceRepo;
import com.example.payroll.service.EmployeeCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeCateRepoImpl implements EmployeeCategoryService {

    private EmployeeCateServiceRepo employeeCateServiceRepo;

    public EmployeeCateRepoImpl(EmployeeCateServiceRepo employeeCateServiceRepo) {
        this.employeeCateServiceRepo = employeeCateServiceRepo;
    }

    @Override
    public EmployeeCategory addEmployeeCategory(EmployeeCategory d) {

        return employeeCateServiceRepo.save(d);
    }

    @Override
    public List<EmployeeCategory> getEmployeeCategories() {

        return employeeCateServiceRepo.findAll();
    }

    @Override
    public EmployeeCategory updateEmployeeCategoryById(EmployeeCategory e) {
        return employeeCateServiceRepo.save(e);
    }

    @Override
    public EmployeeCategory getEmployeeCategoryById(Integer id) {
        return employeeCateServiceRepo.findById(id).orElse(null);
    }
}
