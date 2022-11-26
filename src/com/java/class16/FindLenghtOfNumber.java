package com.java.class16;

import java.util.Scanner;

public class FindLenghtOfNumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Please enter the nr ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);


    }
}
