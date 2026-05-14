package com.fifu.minicourse.core.abstraction.IndiaUPIPay;

public class UserPhone {

    public static void main(String[] args) {

        GooglePay googlePay =
                new GooglePay("Rahul", 5000);

        googlePay.checkBalance();

        googlePay.scanQR();

        googlePay.sendMoney("Ramesh", 1000);

        googlePay.checkBalance();

        System.out.println();

        PhonePe phonePe =
                new PhonePe("Anjali", 3000);

        phonePe.sendMoney("Suresh", 500);
    }
}