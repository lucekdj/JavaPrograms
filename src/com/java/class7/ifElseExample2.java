package com.java.class7;

import java.util.Scanner;

public class ifElseExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your age: ");

        int a = sc.nextInt();

        if (a >= 16) {
            System.out.println(" Ready to drive ");

        } else {
            System.out.println(" Stay home you are too young to drive !! ");


        }

    }
}