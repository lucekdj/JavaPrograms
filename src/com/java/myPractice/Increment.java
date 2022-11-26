package com.java.myPractice;

public class Increment {
    public static void main(String[] args) {
        int a =10;

        int b = a++;  // first b= a czyli 10  => prints b=10  than come back to 10 with ++ so it is 11 =>prints a=11

        System.out.println(a);
        System.out.println(b);


         ++a; // a first incremenn from 11 to 12  than  b = a so it is  10 because in line 7 ++ is after a first a=b


        System.out.println(a);   //12
        System.out.println(b);  // 10


        int c = 10;

        int d = ++c;

        System.out.println(c);   // 11  first increment to 11 ++c than goes to d  and d = c
        System.out.println(d);   // 11

    }


}
