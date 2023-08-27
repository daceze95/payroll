package com.example.payroll.model;

import com.example.payroll.model.constant.EmployeeType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_category")
public class EmployeeCategory {
    @Id
    @GeneratedValue
    private Integer id;

//    @Enumerated(EnumType.STRING)
    private EmployeeType name;

    private String description;

//    @OneToMany(mappedBy = "")
//    private List<Employee> employeeList;
}
