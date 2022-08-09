package com.github.itsAkshayDubey.jpmsserver.serverone.internal;

import com.github.itsAkshayDubey.jpmsserver.filter.Filter;

public class ServerOneFilter implements Filter{

    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ServerOneFilter(String serverName) {
        this.serverName = serverName;
    }

    public void filter(){
        System.out.println("Applying filter for "+ this.serverName+"...");
    }

}
