package com.example.introToSpringBBootApi.Controller;

import com.example.introToSpringBBootApi.DTO.Employee;
import com.example.introToSpringBBootApi.Entities.EmployeeEntity;
import com.example.introToSpringBBootApi.Repository.EmployeeRepository;
import com.example.introToSpringBBootApi.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1")

public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    public EmployeeService employeeService;

    @Autowired
    public EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
         logger.info("about creating employee list");
       EmployeeEntity record =  employeeService.createEmployee(employee);
       logger.error("returning null in some fields");

       return new ResponseEntity<>(record, HttpStatus.CREATED);
    }
}
