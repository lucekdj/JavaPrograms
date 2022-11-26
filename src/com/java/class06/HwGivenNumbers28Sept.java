package com.java.class06;

import java.util.Scanner;

public class HwGivenNumbers28Sept {
    public static void main(String[] args) {

        Scanner bro = new Scanner(System.in);

        //Task 1. Write a program to get a number from user and print square of given number

        System.out.println(" Insert the whole nr");
        int num = bro.nextInt();
        //int square = (num*num);
        System.out.println("Square of the number is: " + num * num);

        //Task 2. Write a program to get principle,
        // rate of interest and number of years from the user and calculate simple interest
        // SI = (principle * time * rate)/100
        System.out.println(" Enter Your Principle Amount ($) ");
        double Principle = bro.nextDouble();

        System.out.println(" Enter the interest rate (%)");
        double Rate = bro.nextDouble();

        System.out.println(" Enter number of years ");
        int Year = bro.nextInt();

        System.out.println(" Your simple interest is: " + (Principle * Rate * Year) / 100);

        //Task 3.  Write a program to take total bill amount and discount percentage
        // from user and print value of final bill amount after discount

        System.out.println("Enter your total bill amount($) ");
        double billamount =bro.nextDouble();

        System.out.println(" Enter discount percentage (%) ");
        float discount = bro.nextFloat();
        double FinalPrice = billamount - (billamount * discount / 100);
        // calculate amount with discount
        System.out.println(" Your total bill amount after discount is: " + FinalPrice);

    }
}





















