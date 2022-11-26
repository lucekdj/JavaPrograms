package com.java.class12Chirag;

import java.util.Scanner;

public class FindReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number (100 to 999): ");
        int num = sc.nextInt(); // For Example - 874
        int rev = 0;

        //3 nr
        // Retrieve last digit from the number
        int lastDigit = num % 10; // Last Digit - 4    874 % 10 = 4 (reminder)
        // Combine last digit with previous value of reverse number
        rev = rev * 10 + lastDigit; // 0 * 10 + 4 = revers 4
        num = num / 10; //   874 /10  = 87.4 but int so  num = 87


        //2 nr
        // Removing last digit from the number
        lastDigit = num % 10; // 87 % 10  = last digit = 7
        rev = rev * 10 + lastDigit; // 4 * 10 + 7 = 47 rivers num
        num = num / 10; //  87/10 = num = 8  removing last digit

        //1 nr
        // Removing last digit from the number

        lastDigit = num % 10; // last digit = 8 %10 =8
        rev = rev * 10 + lastDigit; // 47 * 10 + 8 = 478
        num = num / 10; // 8/10 =0   so num=0


        System.out.println(rev);  //478
    }
}
