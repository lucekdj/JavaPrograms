package com.java.class25HomeWork;

public class MainClassHw {
    public static void main(String[] args) {
        //Create and Initialize Object of class FlyingObject

        FlyingObject plane = new FlyingObject();
        String name = "Cessna";
        String model = "172 Sky hawk" ;
        String color = "white";
        int year = 1989;
        int speed = 140;
        int capacity = 4;
        double distance = 832.0;
        double fuelCapacity = 56;
        double fuelConsumption = 46.6;
        double traveledDistance = 435;



        plane.InfoFlyingObject(name,model,color,year);
        plane.SpecificsFlyingObject(speed,capacity,distance,fuelCapacity);
        plane.FlayingBurnRate(fuelConsumption,traveledDistance);

    }
}
