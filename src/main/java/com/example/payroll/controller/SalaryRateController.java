package com.example.payroll.controller;

import com.example.payroll.model.Employee;
import com.example.payroll.model.SalaryRate;
import com.example.payroll.service.SalaryRateService;
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
    public SalaryRate addSalaryRate(@RequestBody SalaryRate e) {
        return salaryRateService.addSalaryRate(e);
    }

    @GetMapping
    public List<SalaryRate> getSalaryRates() {

        return salaryRateService.getSalaryRates();
    }

    @PutMapping("/{rateId}")
    public SalaryRate updateSalaryRateById(@RequestBody SalaryRate id) {

        return salaryRateService.updateSalaryRateById(id);
    }

    @GetMapping("/{rateId}/employees")
    public List<Employee> getEmployeeBySalaryRate(Integer rateId) {
        return null;
    }
}
