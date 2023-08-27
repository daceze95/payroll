package com.example.payroll.controller;

import com.example.payroll.dto.SalaryRateDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.model.SalaryRate;
import com.example.payroll.service.SalaryRateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salaryrates")
public class SalaryRateController {

    private final SalaryRateService salaryRateService;

    public SalaryRateController(SalaryRateService salaryRateService) {

        this.salaryRateService = salaryRateService;
    }

    @PostMapping
    public ResponseEntity<SalaryRate> addSalaryRate(@RequestBody SalaryRateDTO sr) {

        SalaryRate res = salaryRateService.addSalaryRate(sr);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SalaryRate>> getSalaryRates() {
        List<SalaryRate> res = salaryRateService.getSalaryRates();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/{rateId}")
    public ResponseEntity<SalaryRate> updateSalaryRateById(@PathVariable Integer rateId, @RequestBody SalaryRateDTO sr) {
        sr.setId(rateId);
        SalaryRate res = salaryRateService.updateSalaryRateById(sr);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/{rateId}/employees")
    public ResponseEntity<List<Employee>> getEmployeeBySalaryRate(Integer rateId) {
        List<Employee> res = null;
        return new ResponseEntity<>(res, HttpStatus.OK);

    }
}
