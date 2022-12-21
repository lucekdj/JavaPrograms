package com.java.class27Static_InstanceVarMeth;

class Car {
    int numOfCars;

    Car() {
        numOfCars++;
    }
}

public class InstanceVariableExample {
    public static void main(String[] args) {
        Car honda = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        System.out.println(honda.numOfCars);
        System.out.println(bmw.numOfCars);
        System.out.println(audi.numOfCars);
    }
}
