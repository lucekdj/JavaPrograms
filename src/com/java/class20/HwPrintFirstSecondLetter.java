package com.java.class20;

import java.util.Scanner;

public class HwPrintFirstSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == ' ') {

                System.out.print(name.charAt(0) +  "." + name.charAt(i + 1));
            }


        }


    }
}