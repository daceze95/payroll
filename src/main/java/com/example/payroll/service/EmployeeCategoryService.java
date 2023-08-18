package com.example.payroll.service;

import com.example.payroll.model.Department;
import com.example.payroll.model.EmployeeCategory;

import java.util.List;

public interface EmployeeCategoryService {
    EmployeeCategory addEmployeeCategory(EmployeeCategory d);

    List<EmployeeCategory> getEmployeeCategories();

    EmployeeCategory updateEmployeeCategoryById(EmployeeCategory e);

    EmployeeCategory getEmployeeCategoryById(Integer id);
}
