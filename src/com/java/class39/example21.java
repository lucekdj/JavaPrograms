package com.java.class39;

public class example21 {
    public static void main(String[] args) {


        try {
            int a[] = {23, 44, 55};

            System.out.println(a[2]);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {  /////// !!!!!!!!!!!!!!!!!!
            System.out.println("Nice To See You");
        }
    }
}

