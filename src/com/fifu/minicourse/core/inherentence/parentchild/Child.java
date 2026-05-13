package com.fifu.minicourse.core.inherentence.parentchild;

public class Child extends Father {

    public double money;

    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println(c1.relatives());
    }
}
