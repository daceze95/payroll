package com.example.payroll.model;

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
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;


    private String description;

    /*A dept. can only have one manager*/
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employeeList;
}




