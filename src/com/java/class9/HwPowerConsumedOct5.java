package com.java.class9;

import java.util.Scanner;

public class HwPowerConsumedOct5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        //  Consumption   Rate of Units Charges are as follows
        //  ------------------------------------------------------
        //  If unit is 0-200       Rs.0.50 per unit
        //  If unit is 201-400     Rs.100 plus Rs.0.65 per unit
        //  If unit is 401-600     Rs.230 plus Rs.0.80 per unit
        System.out.println(" Enter the amount of used  power ");
        double amount = user.nextDouble();

        if (amount > 0 && amount <= 200) {
            System.out.println(" Charge is " + amount * 0.50);
        }else if (amount >= 201 && amount<= 400) {
            System.out.println(" Charge is " + amount * 0.65 + 100);
        }else if (amount >= 401 && amount <= 600) {
            System.out.println(" Charge is " + amount * 0.80 + 230);
        }else{
            System.out.println( " Your energy consumption is to high " );

            }


        }
    }
