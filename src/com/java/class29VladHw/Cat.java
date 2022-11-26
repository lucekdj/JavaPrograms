package com.java.class29VladHw;

public class Cat extends Animals { // child class of Animals and parent class of Kitten
    private int tailLength; // instance variables of the class

    Cat() {  // no parameters constructor
    }
    Cat(String name, int age, int weight, int tailLength) { // parameterised constructor
        super(name, age, weight); // calling constructor from parent class
    this.tailLength = tailLength;
    }
}
