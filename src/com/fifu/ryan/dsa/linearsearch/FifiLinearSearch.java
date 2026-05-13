package com.fifu.ryan.dsa.linearsearch;

public class FifiLinearSearch {

    public static void main(String[] args) {
        int[] elements = {42, 68, 1, 45, 10, 8, 24};
        searchFifu(elements, 101);
    }

    public static void searchFifu(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                System.out.println("Element Found at Index : " + i);
                return;
            }
        }
        System.out.println("Element Not Found");
    }
}