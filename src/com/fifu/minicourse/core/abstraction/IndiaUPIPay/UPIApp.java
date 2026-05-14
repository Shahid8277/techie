package com.fifu.minicourse.core.abstraction.IndiaUPIPay;

public abstract class UPI {

    public void operationDebit(String receiver, String username, double userBalance, double amount) {
        System.out.println("get the user, check the balance");
    }

    public abstract void pay();
}