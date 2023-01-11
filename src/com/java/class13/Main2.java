package com.java.class13;

public class Main2 {

    public static void main(String[] args) {
        printValue(getMultiplication( 10,  19));
        printValue(getSqureOfNumber( 10));
        getSqureOfNumber(5);
    }

    static int getSqureOfNumber(int a){
        return getMultiplication(a, a);
    }

    static int getMultiplication(int a, int b){
       return a * b;
    }

    static void printValue(int num){
        System.out.println(num);
    }
}


