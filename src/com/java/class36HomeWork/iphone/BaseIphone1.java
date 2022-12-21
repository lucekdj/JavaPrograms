package com.java.class36HomeWork.iphone;

public abstract  class BaseIphone1 implements Charger1,Locker1, Messenger1 {


    private int batteryLevel1;
    private String messageText1;

    private boolean isLocked1;

    public BaseIphone1() {
        this.isLocked1 = false;
        this.batteryLevel1 = 60;
        this.messageText1 = " Welcome";

    }

    public int getBatteryLevel1() {
        return batteryLevel1;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel1 = batteryLevel;
    }

    public String getMessageText(String messageText) {   // Read Last Message
        return messageText;

    }

    public void setMessageText(String messageText) {    // Read Last Message
        this.messageText1 = messageText;


    }

    public String isLocked() {
        if (!isLocked1) {
            return "Your iphone is unlocked";
        }else
            return "Your iphone is locked";
    }

    public void setLocked(boolean locked){
        isLocked1 = locked;

    }


    @Override
    public void chargeBattery1() {
        batteryLevel1++;
    }

    @Override
    public void lock1() {
        System.out.println("Locked");
        setLocked(true);
    }

    public void unlock1(){
        System.out.println("Unlocked");
        setLocked(false);
    }

    @Override
    public void sendMessage1(String text) {
        messageText1 = text;

    }


    public void readMessage1(){
        System.out.println("Your last message is " + messageText1);
    }



}

