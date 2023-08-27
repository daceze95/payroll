package com.example.payroll.controller;

import com.example.payroll.dto.DepartmentDTO;
import com.example.payroll.model.Department;
import com.example.payroll.model.Employee;
import com.example.payroll.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Department> addDepartment(@RequestBody DepartmentDTO d) {
        Department res = departmentService.addDepartment(d);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Department>> getDepartments() {
        List<Department> res = departmentService.getDepartments();
        return new ResponseEntity<>( res, HttpStatus.OK);
    }

    @PutMapping("/{departmentId}")
    public ResponseEntity<Department> updateDepartmentById(@PathVariable Integer departmentId, @RequestBody DepartmentDTO d) {
        d.setId(departmentId);
        Department res = departmentService.updateDepartmentById(d);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("departmentId") Integer id) {

        Department res = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("/{departmentId}/employees")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable("departmentId") Integer deptId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
