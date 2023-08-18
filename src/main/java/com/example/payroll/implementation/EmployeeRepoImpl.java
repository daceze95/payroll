package com.example.payroll.implementation;

import com.example.payroll.model.Employee;
import com.example.payroll.repository.EmployeeServiceRepository;
import com.example.payroll.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRepoImpl implements EmployeeService {

    private final EmployeeServiceRepository employeeServiceRepository;

    public EmployeeRepoImpl(EmployeeServiceRepository employeeServiceRepository) {
        this.employeeServiceRepository = employeeServiceRepository;
    }

    @Override
    public Employee addEmployee(Employee e) {
        return employeeServiceRepository.save(e);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeServiceRepository.findAll();
    }

    @Override
    public Employee updateEmployeeById(Employee e) {

        return employeeServiceRepository.save(e);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeServiceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getEmployeeUnderManager(Integer id) {
        return null;
    }
}
