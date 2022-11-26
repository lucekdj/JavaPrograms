package com.java.Class05Chirag;

// Write a program to swap values of the two variables
public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10, b = 20, c;

        c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);
    }
}
