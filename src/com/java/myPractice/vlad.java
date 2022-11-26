package com.java.myPractice;
import java.util.Scanner;
public class vlad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < number; j++) {
                System.out.print("* ");
            }
            for (int k = i; k <= number; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
