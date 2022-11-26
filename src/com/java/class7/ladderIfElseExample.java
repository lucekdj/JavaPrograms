package com.java.class7;

import java.util.Scanner;

// Write a program to print day name based on day of week
public class ladderIfElseExample {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter any day of week(1-7): ");
        int dayOfWeek = sc.nextInt();

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");

        }else {
            System.out.println(" enter correct nr");
        }
    }
}









