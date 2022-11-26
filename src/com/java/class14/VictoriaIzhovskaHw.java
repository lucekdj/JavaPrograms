package com.java.class14;

import java.util.Scanner;

public class VictoriaIzhovskaHw {
    static void divisibleBy3(){
        int i = 1;
        System.out.println("Numbers from 1 to 20 divisible by 3:");
        while(i<=20){
            if(i%3==0)
                System.out.println(i);
            i++;
        }
    }
    static void multiplicationTable(int num){
        int a =1;
        while(a<=10){
            System.out.println(a+" * "+ num +" = "+a*num);
            a++;
        }
    }
    static void pattern(){
        int i=1;
        int j=10;
        while(i<=j){
            System.out.println(i);
            System.out.println(j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task1
        System.out.println("\t\t---Task1---");
        System.out.println("Enter a number you want to know the multiplication table for:");
        int num1=sc.nextInt();
        multiplicationTable(num1);
        //Task2
        System.out.println("\t\t---Task2---");
        divisibleBy3();
        //Task3
        System.out.println("\t\t---Task3---");
        pattern();
    }
}