package com.fifu.minicourse.core.hashcodeequal;

public class HashCodeAndEqual {

    public static void main(String[] args) {
        String s1 = "fifu";
        String s2 = new String("fifu");

        if (s1.equals(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
