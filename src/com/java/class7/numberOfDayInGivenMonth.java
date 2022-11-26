package com.java.class7;

import java.util.Scanner;

public class numberOfDayInGivenMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert month number (1-12");

        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("January Days 31");
        } else if (month == 2) {
            System.out.println(" February Days 28");
        } else if (month == 3) {
            System.out.println(" March Days 31");
        } else if (month == 4) {
            System.out.println(" April Days 30");
        } else if (month == 5) {
            System.out.println(" May Days 31");
        } else if (month == 6) {
            System.out.println(" June Days 30");
        } else if (month == 7) {
            System.out.println(" July Days 31");
        } else if (month == 8) {
            System.out.println(" August Days 31");
        } else if (month == 9) {
            System.out.println(" September Days 30");
        } else if (month == 10) {
            System.out.println(" October Days 31");
        } else if (month == 11) {
            System.out.println(" November Days 30");
        } else if (month == 12) {
            System.out.println(" December Days 31");


        }


    }
}