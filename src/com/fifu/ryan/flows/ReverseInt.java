package com.fifu.ryan.flows;

public class ReverseInt {

    public static void main(String[] args) {

        int reversed = reverse(123);

        System.out.println(reversed);
    }

    public static int reverse(int x) {

        int result = 0;

        while (x != 0) {

            int digit = x % 10;   // get last digit
            result = result * 10 + digit; // build reversed number
            x = x / 10; // remove last digit
        }

        return result;
    }
}