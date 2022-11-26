package com.java.class06;

import java.util.Scanner;

public class ProgramToTakeAgeInMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age in years");

        int age = sc.nextInt();

        System.out.println("you have spent   "+ age * 12 +"   months" );
        System.out.println("you have spent "  + age * 365 + "   days");
        System.out.println("you have spent "  + age * 365 * 24 +   " hours");
        System.out.println("you have spent  "+ age * 365 * 24 * 60 +"  minutes");

    }
}
