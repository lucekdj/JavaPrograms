package com.java.class36HomeWorkJasurKadyrow;

public class Iphone7 extends BaseIphone{


    public void unlock() {
        System.out.println("Unlocking using TouchID");
        setLocked(false);
    }
}
