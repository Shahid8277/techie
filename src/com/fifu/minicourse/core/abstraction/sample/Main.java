package com.fifu.minicourse.core.abstraction.sample;

abstract class Student {

    public void attendClass() {
        System.out.println("Attending class");
    }

    public void writeExam() {
        System.out.println("Writing exam");
    }
}

class EngineeringStudent extends Student {
    public void project() {
        System.out.println("Engineering Project");
    }
}

class SSLCStudent extends Student {
    public void homeWork() {
        System.out.println("Engineering Project");
    }
}

public class Main {
    public static void main(String[] args) {

        EngineeringStudent e = new EngineeringStudent();

        e.attendClass();
        e.writeExam();
    }
}