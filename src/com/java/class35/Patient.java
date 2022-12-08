package com.java.class35;


// abstract classes can't be instantiated (means can't create object of this class), initialized directly
// this is good for cases like BaseIphone vs concrete like Iphones like Iphone7
// abstract classes can't be final, because the whole point of abstract classes to be extended
// can't be private
public abstract class Patient {

    public abstract void takeTylenol();
    // abstract methods doesn't have any body
    // abstract class doesn't have any implementation
    // it means we know and require each class will have it own implementation of takeTylenol() method


// we want to create a method to inquire the payments
// ChildPatients should be given 10% disount from original fee
//General Patients should be pay original fee
//Seniors should be given 40% discount from original fee
//Disabled patients should be given 20% fee

//the method should take two param: 1)balance 2)and amountReceived param.
//the method should calculate the discount - subtract amountReceived
//and return remainingBalance.


    public abstract double takePayment(double balance,double payment);

}
