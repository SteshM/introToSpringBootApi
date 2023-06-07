package com.example.introToSpringBBootApi.Controller;

import com.example.introToSpringBBootApi.DTO.Employee;
import com.example.introToSpringBBootApi.Entities.EmployeeEntity;
import com.example.introToSpringBBootApi.Repository.EmployeeRepository;
import com.example.introToSpringBBootApi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1")

public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @Autowired
    public EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){

       EmployeeEntity record =  employeeService.createEmployee(employee);

       return new ResponseEntity<>(record, HttpStatus.CREATED);
    }
}
