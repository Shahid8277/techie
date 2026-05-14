package com.fifu.minicourse.core.abstraction.IndiaUPIPay;

public class PhonePe extends UPIApp {

    public PhonePe(String userName, double balance) {
        super(userName, balance);
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating using UPI PIN in PhonePe");
    }

    @Override
    public void paymentSuccessMessage() {
        System.out.println("PhonePe: Transaction Completed");
    }
}