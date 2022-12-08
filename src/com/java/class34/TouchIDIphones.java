package com.java.class34;

public class TouchIDIphones extends BaseIphone{

    public class TouchIdIphones extends BaseIphone {



        public boolean touchID(String fingerprint){
            if(fingerprint.equalsIgnoreCase("good")){
                return true;
            }else {
                return false;
            }
        }
    }
}
