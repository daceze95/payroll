package com.example.payroll.implementation;

import com.example.payroll.model.Department;
import com.example.payroll.model.Employee;
import com.example.payroll.repository.DepartmentServiceRepository;
import com.example.payroll.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentRepoImpl implements DepartmentService {

    private final DepartmentServiceRepository departmentServiceRepository;

    public DepartmentRepoImpl(DepartmentServiceRepository departmentServiceRepository) {
        this.departmentServiceRepository = departmentServiceRepository;
    }

    @Override
    public Department addDepartment(Department d) {

        return departmentServiceRepository.save(d);
    }

    @Override
    public List<Department> getDepartments() {

        return departmentServiceRepository.findAll();
    }

    @Override
    public Department updateDepartmentById(Department d) {
        return departmentServiceRepository.save(d);
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentServiceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(Integer deptId) {
        return null;
    }
}
