package com.baina.java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private double salary;
    private String department;
    private LocalDate doj; // date of joining

    public Employee(int id, String firstName, String lastName, String gender, double salary, String department, LocalDate doj) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
        this.doj = doj;
    }

    // Getters
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }
    public LocalDate getDoj() { return doj; }

    @Override
    public String toString() {
        return id + " - " + firstName + " " + lastName + " | " + department + " | " + salary;
    }
}


