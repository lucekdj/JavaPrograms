package com.java.Class18Hw;

public class magicNrFrom1_100 {
    public static void main(String[] args) {
        for (int i =1; i <=100; i++){

            if (i%5==4 && i%4==3 && i%3==2 && i%2==1){

                System.out.println( "magic nr is: " + i);

            }
        }
    }
}
