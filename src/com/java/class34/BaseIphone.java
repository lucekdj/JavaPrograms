package com.java.class34;

public class BaseIphone {
    private String model;
    private String color;
    private String iOSVersion;
    private int memoryInMG;

    public String writeMessage(String messages){
        return messages;
    }

    public String writeNote(String notes){
        return notes;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }
}
