package com.example.payroll.controller;

import com.example.payroll.model.Employee;
import com.example.payroll.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee e) {

        return employeeService.addEmployee(e);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PutMapping("/{employeeId}")
    public Employee updateEmployeeById(@RequestBody Employee employeeId) {
        return employeeService.updateEmployeeById(employeeId);
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }


}
