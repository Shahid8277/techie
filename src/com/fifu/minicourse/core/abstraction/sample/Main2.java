package com.fifu.minicourse.core.abstraction.sample;

abstract class Employee {

    Employee() {

    }

    int workingHours = 8;

    public void login() {
        System.out.println("Employee logged in");
    }

    public static void myCompanyName() {
        System.out.println("Employeer Company is Fifu");
    }

    abstract void calculateSalary();

    abstract void role();
}

class Developer extends Employee {

    void calculateSalary() {
        System.out.println("Salary = 60000");
    }

    void role() {
        System.out.println("Writes code");
    }
}

class Tester extends Employee {

    void calculateSalary() {
        System.out.println("Salary = 40000");
    }

    void role() {
        System.out.println("Tests software");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Developer.myCompanyName();

        Developer d = new Developer();
        d.login();
        d.role();
        d.calculateSalary();
    }
}
