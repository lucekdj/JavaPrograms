package com.java.class37;

public abstract class Bank {
    int balance =23;

    public void checkBalance(){
        System.out.println(balance);
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public abstract void displayRateOfInterest();


    }

class CHaseBank extends Bank{


    @Override
    public void displayRateOfInterest() {
        System.out.println("7.0");
    }


}
class BankOfAmerica extends Bank {

    //static int balanceStatic =1 ;
    @Override
    public void displayRateOfInterest() {
        System.out.println("8.0");
    }

   /*
    public static void checkStaticBalance() {

        System.out.println(balanceStatic);
    }
   */
}

class WellsFargo extends Bank {

    @Override
    public void displayRateOfInterest() {

        System.out.println("3.0");
    }
}

