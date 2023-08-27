package com.example.payroll.dto;

import com.example.payroll.model.Department;
import com.example.payroll.model.EmployeeCategory;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Integer id;

    private String fullname;

    private String phonenumber;

    private String address;

    private LocalDate birthDate;

    private LocalDate joinDate;

    private Integer department;

    private Integer employeeCategory;
}
