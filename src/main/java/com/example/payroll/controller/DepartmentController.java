package com.example.payroll.controller;

import com.example.payroll.model.Department;
import com.example.payroll.model.Employee;
import com.example.payroll.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department d) {

        return departmentService.addDepartment(d);
    }

    @GetMapping
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @PutMapping("/{departmentId}")
    public Department updateDepartmentById(@RequestBody Department d) {

        return departmentService.updateDepartmentById(d);
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable("departmentId") Integer id) {

        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/{departmentId}/employees")
    public List<Employee> getEmployeesByDepartment(@PathVariable("departmentId") Integer deptId) {
        return null;
    }

}
