package com.example.payroll.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private String description;

    /*A dept. can only have one manager*/
//    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "manager_id", unique = true)
    private Employee manager;

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employeeList;
}




