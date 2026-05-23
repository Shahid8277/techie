package com.fifu.minicourse.core.abstraction.sampletwo;

public abstract class Customer {
    public String name;
    public long phoneNbr;
    public String emailId;

    public void review() {
        System.out.println("Review");
    }

    public abstract void calculateServiceCharge();
}
