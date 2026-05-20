package com.fifu.minicourse.core.finall;

public class C {

    public static final String RESTO_BAR = "RCB for Ever";
    public final static double gst = 18;

    public final double discount;
    public String orders;

    public C(double discount) {
        this.discount = discount;
    }

    public void holiday() {
        System.out.println("Holiday");
    }

    public void m2() {
        System.out.println("m2");
    }
}