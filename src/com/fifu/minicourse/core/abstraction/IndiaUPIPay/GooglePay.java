package com.fifu.minicourse.core.abstraction.IndiaUPIPay;

public class GooglePay extends UPIApp {

    public GooglePay(String userName, double balance) {
        super(userName, balance);
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating using Fingerprint in Google Pay");
    }

    @Override
    public void paymentSuccessMessage() {
        System.out.println("Google Pay: Payment Successful");
    }

    public void scanQR() {
        System.out.println("Scanning QR using Google Pay");
    }
}