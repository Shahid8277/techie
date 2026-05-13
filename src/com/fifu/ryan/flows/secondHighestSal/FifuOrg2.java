package com.fifu.ryan.flows.secondHighestSal;

import java.util.Comparator;
import java.util.List;

public class FifuOrg2 {

    public static void main(String[] args) {

        Employee e1 = new Employee("fifu1", 200000);
        Employee e2 = new Employee("fifu2", 500000);
        Employee e3 = new Employee("fifu3", 500000);
        Employee e4 = new Employee("fifu4", 900000);
        Employee e5 = new Employee("fifu5", 900000);

        List<Employee> list = List.of(e1, e2, e3, e4, e5);

        // Find second highest distinct salary
        Double secondHighestSalary = list.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Highest Salary: " + secondHighestSalary);

        // Employees having second highest salary
        List<Employee> employees = list.stream()
                .filter(emp -> emp.getSalary().equals(secondHighestSalary))
                .toList();

        employees.forEach(emp ->
                System.out.println(emp.getSalary() + " " + emp.getName()));
    }
}
