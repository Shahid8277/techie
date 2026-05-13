package com.fifu.ryan.flows.secondHighestSal;

public class Employee {

    private String name;
    private Double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}