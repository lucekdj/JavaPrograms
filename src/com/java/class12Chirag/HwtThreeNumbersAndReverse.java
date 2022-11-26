package com.java.class12Chirag;

import java.util.Scanner;

// Print greatest number out of three number
// Input - 10 20 30, Output - 30
public class HwtThreeNumbersAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();
        findGreatestNumber(num1, num2, num3);
    }


    // Method with arguments but no return value
    static void findGreatestNumber(int a, int b, int c) {

        int gratestNumber =0;

        if (a > b && a > c) {
            gratestNumber = a;

        } else if (b > c) {
            gratestNumber = b;

        } else {
            gratestNumber = c;
        }

    }

   // static void reversNumb


}
