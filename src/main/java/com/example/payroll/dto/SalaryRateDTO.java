package com.example.payroll.dto;

import com.example.payroll.model.EmployeeCategory;
import com.example.payroll.model.constant.LevelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryRateDTO {
    private Integer id;
    private Integer employeeCategory;
    private LevelType level;
    private double amount;
}
