package com.fifu.minicourse.core.abstraction.sampletwo;

public class FifuResto {

    public static void main(String[] args) {
        FifuRestoCustomer f1 = new FifuRestoCustomer();

        f1.name = "richi";
        f1.phoneNbr = 1213214L;
        f1.emailId = "richi@gmail.com";
        f1.order = 5;
        f1.rewardPoint = 10;
        f1.menu = "beer, chicken, fries, egg";
        System.out.println(f1);
        f1.order();
        f1.calculateServiceCharge();
        f1.payBill();
        f1.review();

        FifuRestoCustomer f2 = new FifuRestoCustomer();
        f2.name = "anthoy";
        f2.phoneNbr = 213124l;
        f2.emailId = "anthoy@gmail.com";
        f2.order = 4;
        System.out.println(f2);
    }
}