package com.java.class8IfElseCalcDiscount;

import java.util.Scanner;

public class ladderIfElseHomeworkExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks");
        int marks = sc.nextInt();

        if (marks > 100) {
            System.out.println("enter valid marks (0-100");
        }else if (marks >= 90){
            System.out.println("a+");
        }else if (marks >= 80){
            System.out.println("a");
        }else if (marks >= 70){
            System.out.println("b+");
        }else if (marks >= 60){
            System.out.println("b");
        }else if (marks >= 50){
            System.out.println("c+");
        }else if (marks >= 40){
            System.out.println("c");
        }else if (marks >= 30){
            System.out.println("Fail");




        }
    }
}
