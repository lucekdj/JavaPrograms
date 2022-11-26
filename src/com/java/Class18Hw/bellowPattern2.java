package com.java.Class18Hw;

public class bellowPattern2 {

    public static void main(String[] args) {


        for (int i = 5; i>= 1; i--) {



            for (int sp = 1; sp <= 5-i; sp++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }



    }
}




