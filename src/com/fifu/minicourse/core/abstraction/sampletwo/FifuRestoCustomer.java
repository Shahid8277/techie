package com.fifu.minicourse.core.abstraction.sampletwo;

public class FifuRestoCustomer extends Customer {
    public static final String restoName = "Fifu Resto Bar";
    public static final int gst = 18;

    public String menu;
    public int order;
    public double bill;
    public int offer;
    public int rewardPoint;

    public void order() {
        System.out.println("ordered");
    }

    public void payBill() {
        System.out.println("paying bill");
    }

    public void calculateServiceCharge() {
        System.out.println("Service Charge is 150Rs");
    }

    @Override
    public String toString() {
        return "FifuRestoCustomer{" +
                "restoName='" + restoName + '\'' +
                ", name=" + name +
                ", phone=" + phoneNbr +
                ", email=" + emailId +
                ", gst=" + gst +
                ", bill=" + bill +
                ", order=" + order +
                ", offer=" + offer +
                '}';
    }

}