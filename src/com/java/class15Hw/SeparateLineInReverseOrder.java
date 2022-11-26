package com.java.class15Hw;

import java.util.Scanner;

//print each digit of the number into a separate line in reverse order
//Example
//Input - 3575
//Output
//5
//7
//5
//3
public class SeparateLineInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number to print in reverse order ");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.println((num % 10));

            num /= 10; // num = num / 10;



/*
        do{ int i = num % 10;
            System.out.println(i);

            num = num / 10;
            //num /= 10;

        }while (num != 0);
*/

        }
    }
}

