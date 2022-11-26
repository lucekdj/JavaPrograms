package com.java.class0MyPractice;

import java.util.Scanner;

public class HwOddOrEvenUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the nr to check is odd or even ");
        int num = sc.nextInt();
        num = 0; // <--  ten numer override sc.next
        double num1 = 333333; // <--ten deklarowany num1 mie ma znaczenia
        // bo nie jest uzyty w programie i program dziala
        num = 2; // ten nr jest ostatni i on dziala w programie czyli 0%2
                 //nawet jak program pyta to nie ma znaczenia jaki nr wpiszesz
                 // jesli 0 zamienimy na 1 to zawsze bedzie modulo1 czyli odd nr

        if (num % 2 == 0) {
            System.out.println(" Entered nr is Even ");
        } else {
            System.out.println(" Entered nr is Odd ");


        }
    }
}