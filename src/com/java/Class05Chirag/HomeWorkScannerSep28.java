package com.java.Class05Chirag;
import java.util.Scanner;
public class HomeWorkScannerSep28 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Word ");
        String first = sc.nextLine();
        System.out.println("Enter the second Word: ");
        String second = sc.nextLine();
        String third;


        third=second;
        second=first;
        first=third;
        System.out.println("You Entered");
        // if you change println position (first-second) system prints without swamp
        System.out.println(first);
        System.out.println(second);
    }
}
