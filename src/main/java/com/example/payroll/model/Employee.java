package com.example.payroll.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String fullname;

    @Column(nullable = false, unique = true)
    private String phonenumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private LocalDate birthDate;

    @CreatedDate
    private LocalDate joinDate;


    /*Assigned by Admin*/
    //An Employee can be in one dept.
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    //An Employee can only exist in one category
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "employee_category_id")
    private EmployeeCategory employeeCategory;


}
