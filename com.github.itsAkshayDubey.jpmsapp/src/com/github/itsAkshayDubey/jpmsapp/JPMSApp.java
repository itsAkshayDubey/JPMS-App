package com.github.itsAkshayDubey.jpmsapp;

import com.github.itsAkshayDubey.jpmsserver.JPMSServer;
import com.github.itsAkshayDubey.jpmsserver.serverone.JPMSServerOne;
import com.github.itsAkshayDubey.jpmsserver.servertwo.JPMSServerTwo;

public class JPMSApp {

    public static void main(String[] args) {

        JPMSServer serverOne = new JPMSServerOne("hypothetical-dc-1-server-1");
        JPMSServer serverTwo = new JPMSServerTwo("hypothetical-dc-1-server-2");
        serverOne.checkStatus();
        serverTwo.checkStatus();

    }
}
