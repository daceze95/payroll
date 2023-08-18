package com.example.payroll.controller;

import com.example.payroll.model.EmployeeCategory;
import com.example.payroll.service.EmployeeCategoryService;
import com.example.payroll.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeecategories")
public class EmployeeCateController {

    private final EmployeeCategoryService employeeCategoryService;

    public EmployeeCateController(EmployeeCategoryService employeeCategoryService) {

        this.employeeCategoryService = employeeCategoryService;
    }

    @PostMapping
    public EmployeeCategory addEmployeeCategory(@RequestBody EmployeeCategory d) {
        return employeeCategoryService.addEmployeeCategory(d);
    }

    @GetMapping
    public List<EmployeeCategory> getEmployeeCategories() {

        return employeeCategoryService.getEmployeeCategories();
    }

    @PutMapping("/{categoryId}")
    public EmployeeCategory updateEmployeeCategoryById(@RequestBody EmployeeCategory e) {
        return employeeCategoryService.updateEmployeeCategoryById(e);
    }

    @GetMapping("/{employeeId}")
    public EmployeeCategory getEmployeeCategoryById(@PathVariable("employeeId") Integer id) {
        return employeeCategoryService.getEmployeeCategoryById(id);
    }
}
