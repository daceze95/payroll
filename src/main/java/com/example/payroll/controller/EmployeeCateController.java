package com.example.payroll.controller;

import com.example.payroll.model.EmployeeCategory;
import com.example.payroll.service.EmployeeCategoryService;
import com.example.payroll.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<EmployeeCategory> addEmployeeCategory(@RequestBody EmployeeCategory d) {
        EmployeeCategory res = employeeCategoryService.addEmployeeCategory(d);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeCategory>> getEmployeeCategories() {
        List<EmployeeCategory> res = employeeCategoryService.getEmployeeCategories();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<EmployeeCategory> updateEmployeeCategoryById(@RequestBody EmployeeCategory e) {
        EmployeeCategory res = employeeCategoryService.updateEmployeeCategoryById(e);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeCategory> getEmployeeCategoryById(@PathVariable("employeeId") Integer id) {
        EmployeeCategory res = employeeCategoryService.getEmployeeCategoryById(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
