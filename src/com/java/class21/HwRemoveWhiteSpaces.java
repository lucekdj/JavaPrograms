package com.java.class21;

import java.util.Scanner;

public class HwRemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String word = sc.nextLine();

        System.out.println(word.replaceAll(" " , ""));
    }
}
