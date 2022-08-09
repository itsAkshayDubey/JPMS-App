package com.github.itsAkshayDubey.jpmsserver.servertwo;

import com.github.itsAkshayDubey.jpmsserver.JPMSServer;
import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.servertwo.filter.ServerTwoFilter;

public class JPMSServerTwo implements JPMSServer {

    private static final System.Logger LOGGER = System.getLogger("JPMSSeverOne");

    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public JPMSServerTwo(String serverName) {
        this.serverName = serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }


    @Override
    public void checkStatus() {
        System.out.println("-------------------------------------------------");
        Filter filter = new ServerTwoFilter(this.getServerName());
        System.out.println("Checking . . .");
        try {
            if(filter.filter())
                System.out.println(this.serverName+" is up and running.");
            else
                System.out.println(this.serverName+" is down.");
        } catch (InterruptedException e) {
            LOGGER.log(System.Logger.Level.ERROR,e.getMessage());
        }
        System.out.println("-------------------------------------------------");

    }
}
