package com.fifu.ryan.flows;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatFirstOp1 {

    public static void main(String[] args) {

        String demo = "javahome";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of characters
        for (char ch : demo.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find first non-repeating character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}