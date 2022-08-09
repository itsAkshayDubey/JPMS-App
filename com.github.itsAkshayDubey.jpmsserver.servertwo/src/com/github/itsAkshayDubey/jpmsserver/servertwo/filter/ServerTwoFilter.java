package com.github.itsAkshayDubey.jpmsserver.servertwo.filter;

import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.randomizer.TimeGenerator;
import com.github.itsAkshayDubey.jpmsserver.randomizer.BooleanGenerator;

import java.util.Random;

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
    public boolean filter() throws InterruptedException {

        System.out.println("Applying filter for "+this.serverName+"...");
        Thread.sleep(TimeGenerator.getTime());
        return BooleanGenerator.getBoolean();
    }
}
