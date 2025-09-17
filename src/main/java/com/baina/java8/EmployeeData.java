package com.baina.java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(101, "Ravi", "Kumar", "Male", 75000, "IT", LocalDate.of(2020, 5, 15)),
                new Employee(102, "Sita", "Devi", "Female", 85000, "Finance", LocalDate.of(2019, 3, 10)),
                new Employee(103, "Arjun", "Reddy", "Male", 55000, "HR", LocalDate.of(2021, 7, 20)),
                new Employee(104, "Priya", "Sharma", "Female", 95000, "IT", LocalDate.of(2018, 1, 5)),
                new Employee(105, "Rahul", "Verma", "Male", 72000, "Marketing", LocalDate.of(2022, 11, 1)),
                new Employee(106, "Meena", "Gupta", "Female", 72000, "Finance", LocalDate.of(2020, 8, 12)),
                new Employee(107, "Vikram", "Singh", "Male", 50000, "IT", LocalDate.of(2021, 12, 30)),
                new Employee(108, "Anita", "Nair", "Female", 80000, "HR", LocalDate.of(2017, 6, 25)),
                new Employee(109, "Kiran", "Babu", "Male", 90000, "Finance", LocalDate.of(2016, 4, 18)),
                new Employee(110, "Lakshmi", "Menon", "Female", 60000, "Marketing", LocalDate.of(2022, 9, 10))
        );
    }
}
