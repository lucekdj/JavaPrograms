package com.java.class9;

import java.util.Scanner;

public class HwLeapYearOct5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the year to check if it is a leap year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(" It is a leap year");
        } else {
            System.out.println(" Entered year is NOT a leap year ");
        }

    }
}



