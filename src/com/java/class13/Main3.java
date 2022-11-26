package com.java.class13;

public class Main3 {
    public static void main(String[] args) {

        printValue(getSqureOfNumber(10));

    }

        static int getSqureOfNumber ( int a){
            return getMultiplication(a - a, a + 5);
        }

        static int getMultiplication ( int a, int b){
            return a * b;
        }

        static void printValue ( int num){
            System.out.println(num);
        }


}