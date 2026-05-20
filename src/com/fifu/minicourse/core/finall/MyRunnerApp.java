package com.fifu.minicourse.core.finall;

public class MyRunnerApp {

    public static void main(String[] args) {
        System.out.println(C.RESTO_BAR);

        C c1 = new C(100);
        C c2 = new C(1000);
        C c3 = new C(0);

        c2.orders = "100" + "100";


        System.out.println(C.gst + " " + c1.orders + " " + C.gst );
        System.out.println(C.gst + " " + c2.orders);
        System.out.println(C.gst + " " + c3.orders);
    }
}
