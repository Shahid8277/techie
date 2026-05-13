package com.fifu.ryan.flows;

public class NonRepeatFirstOp2 {

    public static void main(String[] args) {

        String demo = "javahome";

        Character result = demo.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> demo.indexOf(ch) == demo.lastIndexOf(ch))
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeating character: " + result);
    }
}