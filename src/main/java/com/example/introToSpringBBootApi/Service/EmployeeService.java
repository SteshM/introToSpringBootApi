package com.example.introToSpringBBootApi.Service;

import com.example.introToSpringBBootApi.DTO.Employee;
import com.example.introToSpringBBootApi.Entities.EmployeeEntity;
import com.example.introToSpringBBootApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeEntity createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employee.getName());
        employeeEntity.setEmpNumber(employee.getEmp_no());
        employeeEntity.setIdNumber(employee.getIdNumber());
        employeeEntity.setContact(employee.getContact());
        employeeEntity.setEmail(employee.getEmail());
        employeeEntity.setDeptName(employee.getDeptName());
        ;
        return  employeeRepository.save(employeeEntity);
    }

    public List<EmployeeEntity> getEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployee(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findEmployeeById(id);
        System.out.println("data"+ employeeEntity);
        return employeeEntity;
    }

    public EmployeeEntity getEmployee(String email) {
        EmployeeEntity employeeEntity = employeeRepository.findEmployeeByEmail(email);
        System.out.println("data"+ employeeEntity);
        return employeeEntity;
    }
    public EmployeeEntity updateEmployee(Long id , Employee employee) {
        EmployeeEntity employeeEntity = employeeRepository.findEmployeeById(id);
        employeeEntity.setName(employee.getName());
        employeeEntity.setEmpNumber(employee.getEmp_no());
        employeeEntity.setIdNumber(employee.getIdNumber());
        employeeEntity.setContact(employee.getContact());
        employeeEntity.setEmail(employee.getEmail());
        employeeEntity.setDeptName(employee.getDeptName());
        ;
        return  employeeRepository.save(employeeEntity);

    }

    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }



    public EmployeeEntity getEmployeeEntityByIdAndEmail(Long id, String email) {
        return employeeRepository.getEmployeeEntityByIdAndEmail(id ,email);
    }
}
