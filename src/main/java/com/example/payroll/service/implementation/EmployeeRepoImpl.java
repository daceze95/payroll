package com.example.payroll.service.implementation;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Department;
import com.example.payroll.model.Employee;
import com.example.payroll.model.EmployeeCategory;
import com.example.payroll.repository.DepartmentServiceRepository;
import com.example.payroll.repository.EmployeeCateServiceRepo;
import com.example.payroll.repository.EmployeeServiceRepository;
import com.example.payroll.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeRepoImpl implements EmployeeService {

    private final EmployeeServiceRepository employeeServiceRepository;
    private final DepartmentServiceRepository departmentServiceRepository;
    private final EmployeeCateServiceRepo employeeCateServiceRepo;



    public EmployeeRepoImpl(EmployeeServiceRepository employeeServiceRepository, DepartmentServiceRepository departmentServiceRepository, EmployeeCateServiceRepo employeeCateServiceRepo) {
        this.employeeServiceRepository = employeeServiceRepository;
        this.departmentServiceRepository = departmentServiceRepository;
        this.employeeCateServiceRepo = employeeCateServiceRepo;
    }

    @Override
    public Employee addEmployee(EmployeeDTO emp) {
        Employee employeeSchema = new Employee();
        Department dept = departmentServiceRepository.findById(emp.getDepartment()).orElse(null);
        EmployeeCategory empCategory = employeeCateServiceRepo.findById(emp.getEmployeeCategory()).orElse(null);
        if(dept != null && empCategory != null) {
            employeeSchema.setId(emp.getId());
            employeeSchema.setFullname(emp.getFullname());
            employeeSchema.setPhonenumber(emp.getPhonenumber());
            employeeSchema.setBirthDate(emp.getBirthDate());
            employeeSchema.setJoinDate(LocalDate.now());
            employeeSchema.setEmployeeCategory(empCategory);
            employeeSchema.setDepartment(dept);
            if(emp.getAddress() != null){
                employeeSchema.setAddress(emp.getAddress());
                return employeeServiceRepository.save(employeeSchema);
            }else{
                throw new IllegalArgumentException("Employee Address cannot be null!");
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeServiceRepository.findAll();
    }

    @Override
    public Employee updateEmployeeById(Employee e) {

        return employeeServiceRepository.save(e);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeServiceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getEmployeeUnderManager(Integer id) {
        return null;
    }
}
