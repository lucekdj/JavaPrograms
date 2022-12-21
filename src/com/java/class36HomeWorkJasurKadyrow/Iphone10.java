package com.java.class36HomeWorkJasurKadyrow;

public class Iphone10 extends BaseIphone{



    @Override
    public void unlock() {
        System.out.println("Unlocking using FaceID");
        setLocked(false);
    }
}
