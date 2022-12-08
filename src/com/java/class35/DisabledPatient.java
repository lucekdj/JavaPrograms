package com.java.class35;

public class DisabledPatient extends Patient{

    public void takeTylenol() {
        System.out.println("Your recommended dose is 200mg");
    }

    @Override
    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.2;
        return (originalBalance - (originalBalance * discount)) - amountReceived;


    }
}
