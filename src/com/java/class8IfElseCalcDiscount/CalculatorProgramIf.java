package com.java.class8IfElseCalcDiscount;

import java.util.Scanner;

public class CalculatorProgramIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please choose your operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = sc.nextInt();

        if (operation == 1)
            System.out.println(num1 + num2);
        if (operation == 2) ;
        System.out.println(num1 - num2);
        if (operation == 3) ;
        System.out.println(num1 * num2);
        if (operation == 4) ;
        System.out.println(num1 / num2);


    }

}
// it has to be else if statement ,otherwise it will print all operations
// no matter what nr from 1-4 you enter
//else condition on the end  doesn't work here ,
// if you enter 1 it will print all numbers but if you enter 2 it will
//   jump    to end statement else ( no condition there )


