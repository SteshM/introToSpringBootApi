package com.example.introToSpringBBootApi.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "id_number",nullable = false)
    private Integer id_number;
    @Column(name = "emp_number",nullable = false)
    private String emp_number;
    @Column(name = "dept_name",nullable = false)
    private String dept_name;
    @Column(name = "contact",nullable = false)
    private Integer contact;

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

    public Integer getId_number() {
        return id_number;
    }

    public void setId_number(Integer id_number) {
        this.id_number = id_number;
    }

    public String getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(String emp_number) {
        this.emp_number = emp_number;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }
}
