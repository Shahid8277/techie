package com.fifu.minicourse.core.accessmodifiers.phone;

public class Phone {

    public static void main(String[] args) {
        Speaker.onSpeaker1(); //static

        Speaker s1 = new Speaker();
        s1.onSpeaker2(); //non static

    }
}
