package com.fifu.minicourse.core.abstraction.IndiaUPIPay;

public abstract class UPIApp {

    protected String userName;
    protected double balance;

    public UPIApp(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    // Common functionality
    public void checkBalance() {
        System.out.println(userName + " balance: ₹" + balance);
    }

    public void sendMoney(String receiver, double amount) {

        if (balance >= amount) {
            authenticate();
            balance -= amount;

            System.out.println("₹" + amount +
                    " sent to " + receiver);

            paymentSuccessMessage();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstraction
    public abstract void authenticate();

    public abstract void paymentSuccessMessage();
}