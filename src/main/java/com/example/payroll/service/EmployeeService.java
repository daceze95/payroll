package com.example.payroll.service;

import com.example.payroll.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee e);

    List<Employee> getEmployees();

    Employee updateEmployeeById(Employee e);

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeUnderManager(Integer empId);
}
