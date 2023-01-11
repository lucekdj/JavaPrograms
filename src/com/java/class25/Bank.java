package com.java.class25;

public class Bank {

    String accName;
    String accNumber;
    double balance;
    int routingNumber;
    char typeOfAccount;
    String currency;

    void deposit(double amount) {
        balance = balance + amount;
       // return balance; can we return if yes how to call it in main?
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Balance after withdraw");
    }

    void transferMoney(String accName, double amount, int routingNumber) {
        System.out.println("Transferring $ " + amount + " to account of (owner name) " + accName + " at routing nr    "+ routingNumber);
    }

}
