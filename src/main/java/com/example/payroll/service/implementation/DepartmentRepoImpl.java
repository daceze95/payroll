package com.example.payroll.service.implementation;

import com.example.payroll.dto.DepartmentDTO;
import com.example.payroll.model.Department;
import com.example.payroll.model.Employee;
import com.example.payroll.repository.DepartmentServiceRepository;
import com.example.payroll.repository.EmployeeServiceRepository;
import com.example.payroll.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentRepoImpl implements DepartmentService {

    private final DepartmentServiceRepository departmentServiceRepository;
    private final EmployeeServiceRepository employeeServiceRepository;

    public DepartmentRepoImpl(DepartmentServiceRepository departmentServiceRepository, EmployeeServiceRepository employeeServiceRepository) {
        this.departmentServiceRepository = departmentServiceRepository;
        this.employeeServiceRepository = employeeServiceRepository;
    }
    @Override
    public Department addDepartment(DepartmentDTO d) {
        Department DeptSchema = new Department();
        System.out.println("\naddDeptment method: " + d.toString() + "\n");

        if(d.getManager() != null){
            Employee isExist = employeeServiceRepository.findById(d.getManager()).orElse(null);
            if(isExist != null){
                DeptSchema.setId(d.getId());
                DeptSchema.setName(d.getName());
                DeptSchema.setDescription(d.getDescription());
                DeptSchema.setManager(isExist);
                return departmentServiceRepository.save(DeptSchema);
            }else{
                throw new IllegalArgumentException("Employee not found! Enter a valid employee id.");
            }
        }else{
            DeptSchema.setId(d.getId());
            DeptSchema.setName(d.getName());
            DeptSchema.setDescription(d.getDescription());
            return departmentServiceRepository.save(DeptSchema);
        }
    }

    @Override
    public List<Department> getDepartments() {

        return departmentServiceRepository.findAll();
    }

    @Override
    public Department updateDepartmentById(DepartmentDTO d) {
        Department isDeptExist = departmentServiceRepository.findById(d.getId()).orElse(null);
        Employee manager = employeeServiceRepository.findById(d.getManager()).orElse(null);
        if(isDeptExist != null){
            if(manager != null){
                isDeptExist.setName(d.getName());
                isDeptExist.setDescription(d.getDescription());
                isDeptExist.setManager(manager);
                return departmentServiceRepository.save(isDeptExist);
            }else{
                throw new IllegalArgumentException("Employee not found! Enter a valid employee id.");
            }
        }else{
            throw new IllegalArgumentException("Department not found! Enter a valid department id.");
        }
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
