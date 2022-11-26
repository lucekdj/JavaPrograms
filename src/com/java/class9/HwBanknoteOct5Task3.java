package com.java.class9;

import java.util.Scanner;

//*
public class HwBanknoteOct5Task3 {
    public static void main(String[] args) {
        Scanner myob = new Scanner(System.in);
        System.out.println(" Enter banknote amount :");
        int banknote = myob.nextInt();
        int note500, note100, note20, note10, note5, note2, note1;

        if (banknote > 0) {

            note500 = banknote / 500;
            note100 = (banknote % 500) / 100;
            note20 = (banknote % 100) / 20;
            note10 = (banknote % 20) / 10;
            note5 = (banknote % 10) / 5;
            note2 = (banknote % 5) / 2;
            note1 = (banknote % 2) % 2;

            System.out.println("Banknote has: ");
            System.out.println(note500 + " notes of 500 ");
            System.out.println(note100 + " notes of 100 ");
            System.out.println(note20 + " notes of 20 ");
            System.out.println(note10 + " notes of 10");
            System.out.println(note5 + " notes of 5 ");
            System.out.println(note2 + " notes of 2 ");
            System.out.println(note1 + " notes of 1 ");

        }
    }

}
