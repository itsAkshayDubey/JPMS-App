package com.github.itsAkshayDubey.jpmsserver.serverone.internal;

import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.randomizer.BooleanGenerator;
import com.github.itsAkshayDubey.jpmsserver.randomizer.TimeGenerator;

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

    public boolean filter() throws InterruptedException {
        System.out.println("Applying filter for "+this.serverName+"...");
        Thread.sleep(TimeGenerator.getTime());
        return BooleanGenerator.getBoolean();

    }

}
