package com.fifu.ryan.flows.secondHighestSal;

import java.util.Comparator;
import java.util.List;

public class FifuOrg {

    public static void main(String[] args) {
        Employee e1 = new Employee("fifu1", 200000);
        Employee e2 = new Employee("fifu2", 500000);
        Employee e3 = new Employee("fifu3", 500000);
        Employee e4 = new Employee("fifu4", 900000);
        Employee e5 = new Employee("fifu5", 900000);

        List<Employee> list = List.of(e1, e2, e3, e4, e5);

        //filter removed duplicated
        List<Employee> resultList = list.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct().toList();
        Employee secondHighest = resultList.get(1);

        //finding
        List<Employee> list1 = list.stream().filter(employee -> employee.getSalary().equals(secondHighest.getSalary())).toList();
        list1.forEach(employee -> System.out.println(employee.getSalary() + " " + employee.getSalary()));

    }
}
