package com.example.introToSpringBBootApi;

public class Employee {
    public long id;
    public String name;
    public String emp_no;
    public Integer id_number;
    public Integer contact;
    public String email;
    public String Dept_name;

    public Employee(
            Long id,
            String name,
            Long emp_no,
            Integer id_number,
            Integer contact,
            String email,
            String Dept_name){
        this.id = id;
        this.name = name;
        this.email = email;
        this.id_number = id_number;
        this.emp_no = String.valueOf(emp_no);
        this.Dept_name = Dept_name;
        this.contact = contact;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(Long emp_no) {
        this.emp_no = String.valueOf(emp_no);
    }

    public Integer getId_number() {
        return id_number;
    }

    public void setId_number(Integer id_number) {
        this.id_number = id_number;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }
}
