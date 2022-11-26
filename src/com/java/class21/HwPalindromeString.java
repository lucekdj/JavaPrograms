package com.java.class21;

import java.util.Scanner;

public class HwPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String word = sc.nextLine().toLowerCase().replaceAll(" ", "");
        String reverseWord ="";


        for (int i = 0; i < word.length(); i++) {

            reverseWord = reverseWord + word.charAt(i);

            if (word.equals(reverseWord)) {

                System.out.println("Palindrome");
            } else {

                System.out.println("Not Palindrome");
            }

        }


    }
}
