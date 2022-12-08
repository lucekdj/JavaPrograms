package com.java.class35;

public class SeniorPatient extends Patient{

    public void takeTylenol(){
        System.out.println("Your recommended dose is 500mg");

    }

    @Override
    public double takePayment(double originalBalance, double amountReceived) {
     double discount = 0.4;
     return (originalBalance-(originalBalance * discount)) - amountReceived;

     }

}
