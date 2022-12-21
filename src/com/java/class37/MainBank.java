package com.java.class37;

public class MainBank {

    public static void main(String[] args) {
        Bank b = new BankOfAmerica();
        Bank w = new WellsFargo();
        Bank c = new CHaseBank();
        b.checkBalance();
        c.displayRateOfInterest();

    }
}
