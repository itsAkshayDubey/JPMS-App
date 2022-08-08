package com.github.itsAkshayDubey.jpmsserver.servertwo;

import com.github.itsAkshayDubey.jpmsserver.JPMSServer;
import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.servertwo.filter.ServerTwoFilter;

public class JPMSServerTwo implements JPMSServer {

    Filter filter = new ServerTwoFilter();
    @Override
    public void checkStatus() {

        System.out.println("Checking . . .");
        filter.filter();
        System.out.println("Server two is up and running.");

    }
}
