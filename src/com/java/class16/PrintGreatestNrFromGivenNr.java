package com.java.class16;

import java.util.Scanner;

public class PrintGreatestNrFromGivenNr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the nr " );
        int num = sc.nextInt();

        int max = 0;

        while (num != 0) {

            int lastdigit = num % 10;

            if (lastdigit > max){
                max = lastdigit;
            }
            num = num / 10;



         // while (num != 0) {
         //   System.out.println(num % 10);
         //   num = num / 10;

        }
        System.out.println(max);

    }

}
