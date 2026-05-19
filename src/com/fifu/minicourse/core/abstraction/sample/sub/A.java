package com.fifu.minicourse.core.abstraction.sample.sub;

public abstract class A {

    public static String count;
    public String name;
    public int value;
    private String amount; // no access || X

    public void m1() {
        System.out.println("10000 code lines M1 Completed");
    }

    public abstract void m2();
}