package com.github.itsAkshayDubey.jpmsserver.servertwo;

import com.github.itsAkshayDubey.jpmsserver.JPMSServer;
import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.servertwo.filter.ServerTwoFilter;

public class JPMSServerTwo implements JPMSServer {

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

    Filter filter = new ServerTwoFilter(this.serverName);
    @Override
    public void checkStatus() {

        System.out.println("Checking . . .");
        filter.filter();
        System.out.println(this.serverName+" is up and running.");

    }
}
