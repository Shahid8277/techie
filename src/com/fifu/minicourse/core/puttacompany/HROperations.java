package com.fifu.minicourse.core.puttacompany;

public class HROperations {

    public static void main(String[] args) {
        Employee guru = new Employee(123, "guru", 2500000);
        Employee putta = new Employee(456, "putta", 300000);
        System.out.println(guru.name);
        System.out.println(putta.name);
    }
}
