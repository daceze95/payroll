package com.example.payroll.service;

import com.example.payroll.dto.DepartmentDTO;
import com.example.payroll.model.Department;
import com.example.payroll.model.Employee;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(DepartmentDTO d);

    List<Department> getDepartments();

    Department updateDepartmentById(DepartmentDTO d);

    Department getDepartmentById(Integer id);

    List<Employee> getEmployeesByDepartment(Integer deptId);
}
