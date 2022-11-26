package com.java.class13;

import java.util.Scanner;

public class HwOct17TempCelToFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the temp in Celsius ");
        double Celsius = sc.nextDouble();

        double temp = ConversionCelsToFahr(Celsius);

        System.out.println(" Celsius temp you entered  in Fahrenheit is " + temp );
    }

    static double ConversionCelsToFahr( double Celsius){

        double Fahrenheit = ( Celsius * 9 / 5 +32);
        return Fahrenheit;

    }






}