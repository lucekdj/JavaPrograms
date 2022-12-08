package com.java.class35Askar;

public class DisabledPatient extends Patient{

    @Override
    public void takeTylenol() {
        System.out.println("your recommended dose is 200mg");
    }



    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.2;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}
