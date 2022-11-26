package com.java.class29VladHw;

public class Kitten extends Cat{
    Cat parentCat;
    Kitten(){}  // no parameters constructor
    Kitten(String name, int age, int weight, int tailLength, Cat parentCat){ // parameterised constructor with object parent
        super(name, age, weight, tailLength); // calling constructor from parent class
        this.parentCat = parentCat; // passing parent object
    }
    Kitten(String name, int age, int weight, int tailLength){ // parameterised constructor
        super(name, age, weight, tailLength);
    }
    public Cat getParentCat() { // Getter
        return parentCat;
    }
    public void setParentCat(Cat parentCat) { // Setter
        this.parentCat = parentCat;
    }
}
