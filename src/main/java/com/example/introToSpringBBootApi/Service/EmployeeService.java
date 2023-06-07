package com.example.introToSpringBBootApi.Service;

import com.example.introToSpringBBootApi.Controller.EmployeeController;
import com.example.introToSpringBBootApi.DTO.Employee;
import com.example.introToSpringBBootApi.Entities.EmployeeEntity;
import com.example.introToSpringBBootApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeEntity createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employee.getName());
        employeeEntity.setEmpNumber(employee.getEmp_no());
        employeeEntity.setIdNumber(employee.getId_number());
        employeeEntity.setContact(employee.getContact());
        employeeEntity.setEmail(employee.getEmail());
        employeeEntity.setDeptName(employee.getDept_name());
        ;
        return  employeeRepository.save(employeeEntity);
    }
}
