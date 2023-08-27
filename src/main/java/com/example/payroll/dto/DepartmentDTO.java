package com.example.payroll.dto;

import com.example.payroll.model.Employee;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private Integer id;

    private String name;

    private String description;

    private Integer manager;

    @Override
    public String toString(){
        return "DepartmentDTO{dept_id: " + id + " name: " + name + " description: " + description + " manager: " + manager + "}";
    }
}
