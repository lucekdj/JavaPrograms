package com.java.class39.Exceptions;

public class example21 {
    public static void main(String[] args) {


        try {
            int a[] = {23, 44, 55};

                 System.out.println(a[3]);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {  /////// !!!!!!!!!!!!!!!!!!
            System.out.println("Nice To See You");
        }
    }
}

