package com.java.class7;

import java.util.Scanner;

public class ifElseExample {
    public static void main(String[] args) {
        //Write a program to get two nr from user and print maximum number

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the First nr: ");
        double num1 = sc.nextDouble();
        // int a = sc.nextInt();

        System.out.println(" Enter the second nr: ");
        double num2 = sc.nextDouble();
        // if(a>b)
        if (num1 > num2 ) {
            System.out.println("this nr is bigger" + num1);
        }else{
            System.out.println("this nr is bigger" + num2);
        }
    }
}
