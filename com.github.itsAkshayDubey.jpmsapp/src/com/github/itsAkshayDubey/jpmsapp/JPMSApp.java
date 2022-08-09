package com.github.itsAkshayDubey.jpmsapp;

import com.github.itsAkshayDubey.jpmsserver.JPMSServer;
import com.github.itsAkshayDubey.jpmsserver.serverone.JPMSServerOne;
import com.github.itsAkshayDubey.jpmsserver.servertwo.JPMSServerTwo;

public class JPMSApp {

    public static void main(String[] args) throws InterruptedException {

        JPMSServer serverOne = new JPMSServerOne("hypothetical-dc-1-server-1");
        JPMSServer serverTwo = new JPMSServerTwo("hypothetical-dc-1-server-2");
        Thread t1 = new Thread(()-> {
            try {
                serverOne.checkStatus();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        Thread t2 = new Thread(()-> {
            try {
                serverTwo.checkStatus();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();

        t1.join();
        t2.join();

    }
}
