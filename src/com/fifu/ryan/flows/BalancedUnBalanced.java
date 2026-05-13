package com.fifu.ryan.flows;

import java.util.Stack;

public class BalancedUnBalanced {

    static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // opening brackets → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // closing brackets → must match last opened
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatching(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("{[]}"));     // true
        System.out.println(isBalanced("{[()]}"));   // true
        System.out.println(isBalanced("{[(])}"));   // false
        System.out.println(isBalanced("}{"));       // false
    }
}