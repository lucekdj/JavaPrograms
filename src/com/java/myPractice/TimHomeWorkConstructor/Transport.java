package com.java.myPractice.TimHomeWorkConstructor;

public abstract class Transport {  // Abstract clas????

    private String name;
    private int speed;
    private int yearMake;

    public Transport(){

    }


    public Transport(String name , int speed, int yearMake){
        this.name = name;
        this.speed = speed;
        this.yearMake = yearMake;

    }


    public Transport (String name ){
        this.name = name;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed(){
        return speed;

   }

   public void setSpeed(){
        this.speed = speed;

   }
}
