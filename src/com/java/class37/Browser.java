package com.java.class37;

public interface Browser {
    void closeBrowser();

    void openIncognito();
}

interface WebBrowser extends Browser {
    void fullScreen();
}

interface MobileBrowser extends Browser {
    void SupportRotation1();

    void supportRotation();
}
/*
class Chrome implements WebBrowser, MobileBrowser {
    public void closeBrowser() {

    }

    public void openIncognito() {
        System.out.println("CNTR + Shift + T");
    }

    public void fullScreen() {

    }

    public void supportRotation() {
    }

}

class FireFox implements Browser {
    public void closeBrowser() {

    }

    public void openIncognito() {
        System.out.println("CNTR + Shift + T");
    }
    }
 */



