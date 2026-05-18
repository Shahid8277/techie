package com.fifu.minicourse.core.datatypes;

public class HROffice {

    static String companyName = "OLA";

    UserType user1 = new UserType();

    public static void main(String[] args) {
        String hrName = "mithila";
        long hrPhone = 9908878655L;
        int rank = 2;
        boolean isHRinOffice = true;

        UserType user1 = new UserType("fifu", 9087655756L, 687682.00);


        String officeLocation = UserType.OfficeLocation;
        UserType user2 = new UserType();
        double userSalary = user2.userSalary;
    }
}
