package com.github.itsAkshayDubey.jpmsserver.serverone;

import com.github.itsAkshayDubey.jpmsserver.*;
import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.serverone.internal.ServerOneFilter;
import com.github.itsAkshayDubey.jpmsserver.serverone.internal.ServerOneFilter;

public class JPMSServerOne implements JPMSServer {

    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public JPMSServerOne(String serverName) {
        this.serverName = serverName;
    }

    Filter filter = new ServerOneFilter(this.serverName);

    @Override
    public void checkStatus() {
        System.out.println("Checking . . .");
        filter.filter();
        System.out.println(this.serverName+" is up and running.");
    }
}
