package com.fifu.minicourse.core.inherentence.parentchild;

public class Father extends Object {
    public String house;
    String name;
    String car;
    int noOfSite = 100;

    public void power(){
        System.out.println("Parents power");
    }

    protected String relatives(){
        return "relations";
    }
}