package com.fifu.minicourse.core.datatypes;


public class UserType {
    String userName;
    long userPhoneNbr;
    double userSalary;
    static String OfficeLocation;

    public UserType(String userName, long userPhoneNbr, double userSalary) {
        this.userName = userName;
        this.userPhoneNbr = userPhoneNbr;
        this.userSalary = userSalary;

    }

    public UserType() {

    }
}
