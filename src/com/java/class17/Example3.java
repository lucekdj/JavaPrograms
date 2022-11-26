package com.java.class17;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){

            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }

        }

        for (int i = 1; i <= num / 2; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
