package com.java.class35Askar;

public class SeniorPatient extends Patient{

    @Override
    public void takeTylenol() {
        System.out.println("your recommended dose is 500mg");
    }


    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.9;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}
