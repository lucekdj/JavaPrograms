package com.java.class25;

public class MainClass {
    public static void main(String[] args) {
        //Create two instances of the class acc1 and acc2

        // Create and Initialize Object acc1
        Bank acc1 = new Bank();
        // calling the method "deposit" from the Class "Bank"
        // and passing 3000 as an argument to be stored in the "amount" variable
        acc1.balance = 1000;
        acc1.accName = "Chirag";
        acc1.routingNumber = 0;

        acc1.deposit(3300);
        acc1.transferMoney("Chirag", 345 , 456);
        System.out.println(acc1.balance);

        // Create and Initialize Object acc2

        Bank acc2 = new Bank();

        acc2.accName = "Jadia";
        acc2.balance = 5000;
        acc2.accNumber = "ac -45677";


        acc2.withdraw(4500);
        acc2.transferMoney("Jadia",100, 99999);

        System.out.println(acc2.balance);

    }
}
