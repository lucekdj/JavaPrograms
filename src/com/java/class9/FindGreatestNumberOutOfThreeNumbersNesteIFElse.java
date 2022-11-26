package com.java.class9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindGreatestNumberOutOfThreeNumbersNesteIFElse {
    public static void main(String[] args) {
        Scanner myob = new Scanner(System.in);


        System.out.println("Please enter first number: ");
        int num1 = myob.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = myob.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = myob.nextInt();
/*
        if (num1 > num2 && num1 > num3) {
            System.out.println("the gartest number is num1 ");
        }
        if (num2 > num3) {
            System.out.println("the gartest number is num2 ");
        } else {
            System.out.println("the gartest number is num3 ");

*/
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("greatest is nr1");
                } else {
                    System.out.println("greatest is" + num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println("greatest is nr2");
                } else {
                    System.out.println("greatest is " + num3);


                }

            }


        }
    }


