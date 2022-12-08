package com.java.class35Abstract;



    //abstract classes can not be instantiated, initialized directly
//this is good for cases like BaseIphone vs concrete Iphones like Iphone7
//abstract classes can not be final. =>
//what happens if the class is final? => you cannot extend it. you can not change any values in it.
//Because the whole point of abstract classes is to be extended.
//abstract classes can not be market private.
    public abstract class Patient {
        //abstract methods do not have any implementation
        //which means we know and require each child class to have a takeTylenol method
        //and should write the specific logic to each child class
        public abstract void takeTylenol();
    }

