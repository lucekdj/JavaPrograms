package com.java.myPractice;

public class NestedForLoopExample11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }

        for (int i = 4; i > 1; i--){

                for (int j = 1; j < i; j++) {
                    System.out.print("A");
                }
                System.out.println(); //Enter for space

        }
    }}
