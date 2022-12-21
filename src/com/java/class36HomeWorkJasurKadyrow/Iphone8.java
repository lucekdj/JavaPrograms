package com.java.class36HomeWorkJasurKadyrow;

public class Iphone8 extends BaseIphone{



    @Override
    public void unlock() {
        System.out.println("Unlocking using TouchID or FaceID");
        setLocked(false);

    }
}
