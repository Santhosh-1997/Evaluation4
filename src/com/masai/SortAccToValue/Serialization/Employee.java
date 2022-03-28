package com.masai.SortAccToValue.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private String empId;
    private String empName;
    private String email;
    transient private String password;
    Address address;

    public Employee() {
    }

    public Employee(String empId, String empName, String email, String password, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
