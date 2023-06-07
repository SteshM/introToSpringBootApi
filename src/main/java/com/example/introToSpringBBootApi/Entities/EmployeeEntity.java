package com.example.introToSpringBBootApi.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   public String name;
    public String email;
    public int idNumber;
    public String empNumber;
    public String deptName;
    public int contact;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public EmployeeEntity(Long id, String name, String email, int idNumber, String empNumber, String deptName, int contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.idNumber = idNumber;
        this.empNumber = empNumber;
        this.deptName = deptName;
        this.contact = contact;
    }

    public EmployeeEntity() {
    }


    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                ", empNumber='" + empNumber + '\'' +
                ", deptName='" + deptName + '\'' +
                ", contact=" + contact +
                '}';
    }
}
