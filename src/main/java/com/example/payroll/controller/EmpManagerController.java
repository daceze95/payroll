package com.example.payroll.controller;

import com.example.payroll.model.Employee;
import com.example.payroll.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpManagerController {

    private final EmployeeService employeeService;

    public EmpManagerController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}/employees")
    public List<Employee> getEmployeeUnderManager(@PathVariable("employeeId") Integer empId) {
        return employeeService.getEmployeeUnderManager(empId);
    }
}
