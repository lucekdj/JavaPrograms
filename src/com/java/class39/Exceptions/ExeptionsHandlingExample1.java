package com.java.class39.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionsHandlingExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        try{
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1/num2);

        }catch (InputMismatchException exceptions){
            System.out.println("Please enter number only");

        }catch (ArithmeticException exceptions){
            System.out.println("Please study maths first, you cannot divide with zero");

        }catch (Exception e){
        System.out.println("Please study ");
    }

        System.out.println("Nice to see you");

    }
}
