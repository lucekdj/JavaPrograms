package com.java.class11Switch;

import java.util.Scanner;
//  Write a program to get a number and print day name as per below mapping
//  0 - Sunday
//  1 - Monday
//  2 - Tuesday....
//  6 - Saturday
public class HwWeekDaysSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter the number from (1-6) ");
        int week = sc.nextInt();

        switch (week) {
            case 0:
                System.out.println(" Sunday ");
                break;
            case 1:
                System.out.println(" Monday ");
                break;
            case 2:
                System.out.println(" Tuesday ");
                break;
            case 3:
                System.out.println(" Wednesday ");
                break;
            case 4:
                System.out.println(" Thursday ");
                break;
            case 5:
                System.out.println(" Friday ");
                break;
            case 6:
                System.out.println(" Saturday");
                break;
            default:
                System.out.println(" Please enter the valid nr");


        }
    }
}
