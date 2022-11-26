package com.java.class29VladHw;

public class Main {
    public static void main(String[] args) {

        Animals animal1 = new Animals(); // creating an animal object using no parameters constructor
        Animals animal2 = new Animals("Name", 1, 1); // creating an animal object using parameterised constructor
        Cat cat = new Cat(); // creating a cat object using no parameters constructor
        Cat murzik = new Cat("Murzik", 7, 5, 3);// creating a cat object using parameterised constructor
        Kitten kitten = new Kitten(); // creating a kitten object using no parameters constructor
        Kitten barsik = new Kitten("Barsik", 2, 3, 2, murzik); // creating a kitten object using parameterised constructor, passing a parent object
        Kitten murka = new Kitten("Murka",1, 2,1); // creating a kitten object using parameterised constructor without parent
        System.out.println("Father cat is " + murzik.getName()); // access object variable through getter method
        System.out.println(barsik.getParentCat().getName() + " is a father of " + barsik.getName()); // accessing object and passed parent object variables through getter methods
        System.out.println(murka.getName()+ " is a homeless kitten, we don't know her parents names"); // example of using constructor with no object parent passed

    }


}
