package com.example.introToSpringBBootApi.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    public Long id;
    public String name;
    @JsonProperty("empNo")
    public String emp_no;
    public int idNumber;
    public int contact;
    public String email;
    public String deptName;

    public Employee(Long id, String name, String emp_no, int idNumber, int contact, String email, String deptName) {
        this.id = id;
        this.name = name;
        this.emp_no = emp_no;
        this.idNumber = idNumber;
        this.contact = contact;
        this.email = email;
        this.deptName = deptName;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emp_no='" + emp_no + '\'' +
                ", id_number=" + idNumber +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                ", Dept_name='" + deptName + '\'' +
                '}';
    }
}
