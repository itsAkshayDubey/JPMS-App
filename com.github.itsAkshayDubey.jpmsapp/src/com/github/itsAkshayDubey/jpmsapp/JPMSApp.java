package com.github.itsAkshayDubey.jpmsapp;

import com.github.itsAkshayDubey.jpmsserver.JPMSServer;
import com.github.itsAkshayDubey.jpmsserver.serverone.JPMSServerOne;
import com.github.itsAkshayDubey.jpmsserver.servertwo.JPMSServerTwo;

public class JPMSApp {

    public static void main(String[] args) {

        JPMSServer serverOne = new JPMSServerOne();
        JPMSServer serverTwo = new JPMSServerTwo();
        serverOne.checkStatus();
        serverTwo.checkStatus();

    }
}
