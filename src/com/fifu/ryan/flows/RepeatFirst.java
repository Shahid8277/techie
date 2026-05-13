package com.fifu.ryan.flows;

public class RepeatFirst {
    public static void main(String[] args) {
        String demo = "todayisfriday";

        findFirstReapt(demo);
    }

    public static void findFirstReapt(String demo) {

        char[] mychars = demo.toCharArray();
        for (int i = 0; i < mychars.length - 1; i++) {

            for (int j = i + 1; j < mychars.length - 1; j++) {
                if (mychars[i] == mychars[j]) {
                    System.out.println(mychars[i]);
                    return;
                }
            }
        }
    }
}