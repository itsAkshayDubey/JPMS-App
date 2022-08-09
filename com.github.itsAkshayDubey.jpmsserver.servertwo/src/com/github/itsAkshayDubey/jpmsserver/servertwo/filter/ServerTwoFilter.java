package com.github.itsAkshayDubey.jpmsserver.servertwo.filter;

import com.github.itsAkshayDubey.jpmsserver.filter.Filter;

public class ServerTwoFilter implements Filter {

    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ServerTwoFilter(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void filter() {
        System.out.println("Applying filter for "+this.serverName+"...");
    }
}
