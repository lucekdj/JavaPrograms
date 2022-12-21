package com.java.class36HomeWork.iphone;

public class Iphone10 extends BaseIphone1 {

    public void unlock() {
        System.out.println("Unlocking using TouchID or FaceId");
        setLocked(false);
    }
}
