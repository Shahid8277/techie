package com.fifu.ryan.dsa.binarysearch;

public class FifiBinarySearch {
    public static void main(String[] args) {
        int[] elements = {1, 8, 10, 24, 42, 45, 68, 87, 98};
        searchFifu(elements, 45);
    }

    public static void searchFifu(int[] elements, int target) {

        int left = 0;
        int right = elements.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2; //(right - left) = how many steps exist between them and why we are adding left [converts it back to real array index] as it's a starting point of that part of array now

            if (elements[middle] == target) {
                System.out.println("Element Found at Index: " + middle);
                return;
            }

            if (target > elements[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("Element Not Found");
    }
}