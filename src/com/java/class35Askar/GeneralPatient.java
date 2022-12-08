package com.java.class35Askar;

public class GeneralPatient extends Patient{

    public void takeTylenol() {
        System.out.println("your recommended dosage is 250 mg");
    }


    @Override
    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.0;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}



