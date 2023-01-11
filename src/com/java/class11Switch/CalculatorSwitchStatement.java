package com.java.class11Switch;

import java.util.Scanner;

public class CalculatorSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first nr");
        int num1 = sc.nextInt();
        System.out.println("Enter the operation");
        String operation = sc.next();
        System.out.println("Enter the second nr");
        int num2 = sc.nextInt();

        switch (operation) { //   operation.toLowercase or  .toUppercase
            case "add":
            case "Add":
                System.out.println(num1 + num2);
                break;
            case "-":
            case "sub":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "div":
                System.out.println(num1 / num2);
                break;
            case "mod":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println(" Enter correct operation from above suggested");


        }
    }
}
