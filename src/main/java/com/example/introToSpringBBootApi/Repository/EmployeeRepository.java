package com.example.introToSpringBBootApi.Repository;

import com.example.introToSpringBBootApi.DTO.Employee;
import com.example.introToSpringBBootApi.Entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    EmployeeEntity findEmployeeById(Long id);

    EmployeeEntity findEmployeeByEmail(String email);



    EmployeeEntity getEmployeeEntityByIdAndEmail(Long id, String email);
}