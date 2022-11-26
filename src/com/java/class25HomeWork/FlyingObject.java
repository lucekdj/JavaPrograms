package com.java.class25HomeWork;

public class FlyingObject {

    String name;
    String model;
    String color;

    int year;
    double speed;
    int capacity;
    double fuelBurnRate;
    double distance;
    double fuelCapacity;
    double traveledDistance;
    double fuelConsumption;


    void InfoFlyingObject(String name, String model, String color, int year) {
        System.out.println("This airplane name is " + name + ", version " + model + ". Year made " + year + " of " + color + " color. ");
    }

    void SpecificsFlyingObject(int speed, int capacity, double distance, double fuelCapacity) {
        System.out.println("\nWith full Speed of " + speed + " mph and full capacity of " + capacity + " passangers" + " make distance " + distance + " miles");
        System.out.println("\nFuel capacity of around " + fuelCapacity + "gallons.");
    }

    void FlayingBurnRate(double fuelConsumption, double traveledDistance) {

       // fuelConsumption = (fuelConsumption * 100) / traveledDistance;
        fuelConsumption = ( traveledDistance  / fuelConsumption);

        System.out.println("\nGas usage " + fuelConsumption + " gallons per mile.");
    }
}


