package com.example.payroll.model;

import com.example.payroll.model.constant.EmployeeType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_category")
public class EmployeeCategory {
    @Id
//    @GeneratedValue
    @Column(unique = true)
    private Integer id;

//    @Enumerated(EnumType.STRING)
    private EmployeeType name;

    private String description;

//    @OneToMany(mappedBy = "")
//    private List<Employee> employeeList;
}
