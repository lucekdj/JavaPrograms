package com.java.Class18Hw;

import java.util.Scanner;

public class bellowPattern5Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nr");
        int num = sc.nextInt();


        for (int i = 1; i <= num/2; i++) {
            for (int s = 0; s <= num/2- i; s++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= num/2+1 ; i++) {
            for (int s = 0; s <= i - 2; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=num+2-i*2; j++) {
                if (i % 2 != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}

