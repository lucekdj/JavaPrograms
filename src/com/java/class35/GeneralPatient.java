package com.java.class35;

public class GeneralPatient extends Patient{

    public void takeTylenol(){
        System.out.println("Your recommended dosage id 250mg");

    }

    @Override
    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.2;
        return originalBalance - amountReceived;


    }
}
