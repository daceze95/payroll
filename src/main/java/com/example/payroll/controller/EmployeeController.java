package com.example.payroll.controller;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDTO e) {
       Employee res = employeeService.addEmployee(e);
        return new ResponseEntity(res, HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> res =  employeeService.getEmployees();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/employees/{employeeId}")
    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employeeId) {
        Employee res = employeeService.updateEmployeeById(employeeId);
        return new ResponseEntity(res, HttpStatus.OK);
    }

    @GetMapping("/employees/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
        Employee res = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity(res, HttpStatus.OK);
    }

    @GetMapping("/{employeeId}/employees")
    public ResponseEntity<List<Employee>> getEmployeeUnderManager(@PathVariable("employeeId") Integer empId) {
        List<Employee> res =  employeeService.getEmployeeUnderManager(empId);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }


}
