package com.java.class37;

public interface Browser1 {

    void closeBrowser1();

    void openIncognito1();

}

interface WebBrowser1 extends Browser1{

    void  fullScreen1();

}

interface MobileBrowser1 extends Browser1{

    void  SupportRotation1();

}
class Chrome1 implements MobileBrowser,WebBrowser {


    public void SupportRotation1(){
        System.out.println("Rotate");
    }

    public void fullScreen1(){
        System.out.println("show full screen");

    }

    public void openIncognito1(){
        System.out.println("Incognito ");
    }


    @Override
    public void closeBrowser() {

    }

    @Override
    public void openIncognito() {

    }

    @Override
    public void fullScreen() {

    }

    @Override
    public void supportRotation() {

    }
}

