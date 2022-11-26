package com.java.class10;

import java.util.Scanner;

public class Hw3ReverseDigitNr {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Pease enter 3 digit nr (100->999) : ");

        int digit = user.nextInt();

        if (digit >= 100 && digit < 1000) {
            int reverse1 = (digit % 10);
            int reverse2 = (digit % 100) /10;
            int reverse3 = (digit / 100);
            System.out.println(" Reversed nr is: " + reverse1+reverse2+reverse3);
        } else {
            System.out.println(" Please enter walid nr ");
        }

    }
}