package com.example.introToSpringBBootApi.Controller;

import com.example.introToSpringBBootApi.Employee;
import com.example.introToSpringBBootApi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/vi/Employee")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

}
