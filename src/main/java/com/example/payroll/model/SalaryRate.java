package com.example.payroll.model;

import com.example.payroll.model.constant.LevelType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salary_rate")
public class SalaryRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_category_id", nullable = false)
    private EmployeeCategory employeeCategory;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LevelType level;

    //salary amount will be det. by category and level
    private double amount;
}
