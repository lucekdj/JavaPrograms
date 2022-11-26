package com.java.class11Switch;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int num = user.nextInt();

        switch(num){
            case 0:
            System.out.println("zero");
            break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Three");
                break;
            case 3:
                System.out.println("Four");
                break;
            case 4:
                System.out.println("Five");
                break;
            case 5:
                System.out.println();
            default:
                System.out.println("Please enter number from 0 to 5 only");



        }
    }

}
