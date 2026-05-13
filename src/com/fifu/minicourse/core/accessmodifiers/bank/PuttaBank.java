package com.fifu.minicourse.core.accessmodifiers.bank;

public class PuttaBank {

    public double deposite(BankUser bankUser, int despositeAmount) {
        System.out.println("Account is valid : " + bankUser.accountNbr);
        System.out.println("despositeAmount is valid : " + despositeAmount);

        bankUser.balance = bankUser.balance + despositeAmount;
        return bankUser.balance;
    }
}
