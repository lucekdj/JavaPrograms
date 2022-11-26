package com.java.class0MyPractice;

import java.util.Scanner;

public class HwGivenNumbers28Sept {
    public static void main(String[] args) {

        Scanner bro = new Scanner(System.in);

        //Task 1. Write a program to get a number from user and print square of given number

        System.out.println(" Insert the whole nr");
        int num = bro.nextInt();
        int square = (num * num);
        System.out.println(square + " is square of the nr " );
        //System.out.println("Square of the number is: " + num * num);

    }
}
