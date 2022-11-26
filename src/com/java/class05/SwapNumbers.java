package com.java.class05;

public class SwapNumbers {
    public static void main(String[] args) {


        int a = 10, b = 20, c;
        System.out.println(a);
        System.out.println(b);
        c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);

        int d = 15, e = 5, f = 25;

        e = d; //5 ->15
        d = d * 2; // 15 * 2 = 30
        f = d * e; //30*15 =450

        System.out.println(f);
    }
}
