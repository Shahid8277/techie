package com.fifu.minicourse.core.accessmodifiers.bank;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        BankUser guru = new BankUser();
        guru.accountNbr = "ICICI457778";
        guru.balance = 200;


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount you want deposite: ");
        int desposite = sc.nextInt();

        System.out.println("User wants to deposite amount : " + desposite);

        PuttaBank puttaBankForUser1 = new PuttaBank();
        double totalBalance = puttaBankForUser1.deposite(guru, desposite);

        System.out.println("successfully transaction is done and total balance : " + totalBalance);

    }
}
