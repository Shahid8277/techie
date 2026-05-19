package com.fifu.minicourse.core.abstraction.sample.sub;

public class MyRunnerApp {

    public static void main(String[] args) {
        System.out.println(C.count);

        C c = new C();
        System.out.println(c.name);
        System.out.println(c.value);
        c.m1();
        c.result();
        c.m2();
        c.holiday();

        c.uniform();
        c.books();

    }
}
