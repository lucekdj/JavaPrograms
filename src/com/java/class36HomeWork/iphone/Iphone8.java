package com.java.class36HomeWork.iphone;

public class Iphone8 extends BaseIphone1 {

    public void unlock() {
        System.out.println("Unlocking using TouchID");
        setLocked(false);
    }
}
