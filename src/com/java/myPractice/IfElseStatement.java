package com.java.myPractice;

public class IfElseStatement {
    public static void main(String[] args) {

        boolean b = false;
        boolean c = true;

        //System.out.println("1");
        if (b) {
            System.out.println("2");
             if (c) {
                System.out.println("6");
            }
        }  else {
            System.out.println("3");

        }
        System.out.println("4");
    }
}
