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
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1")

public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    public EmployeeService employeeService;

    @Autowired
    public EmployeeRepository employeeRepository;


//Create employee records
    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
         logger.info("about creating employee list");
       EmployeeEntity record =  employeeService.createEmployee(employee);
       logger.error("returning null in some fields");

       return new ResponseEntity<>(record, HttpStatus.CREATED);
    }

//  Retrieving records of all employees
    @GetMapping("/employees")
    public ResponseEntity<?> availableEmployees(){
        List<EmployeeEntity> allData = employeeService.getEmployees();
        logger.info("Fetched details of {}employees",allData.size());
        return new ResponseEntity<>(allData,HttpStatus.OK);
    }
//Fetching details of a single student
    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable Long id){
        EmployeeEntity singleEmployee = employeeService.getEmployee(id);
        logger.info("employee fetched : {}", singleEmployee);
        return new ResponseEntity<>(singleEmployee , HttpStatus.OK);
    }
//Updating details of a single student
    @PutMapping("/employee/{id}")
        public ResponseEntity<?>replaceEmployee(@PathVariable Long id , @RequestBody Employee employee){
        EmployeeEntity singleEmployee = employeeService.updateEmployee(id , employee);
        logger.info("About to update details of an employee with id {}" , id);
        return new ResponseEntity<>(singleEmployee,HttpStatus.OK);
    }

    //deleting a record

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        employeeService.deleteById(id);
    }




}
