package com.fifu.minicourse.core.constructor;

public class Employee {
    public String name;
    public String address;

    public Employee() {
        System.out.println("Employing is getting created with" + name);
    }

    public void getEmployee(String name) {
        System.out.println("Employing is getting created with" + name);
    }
}