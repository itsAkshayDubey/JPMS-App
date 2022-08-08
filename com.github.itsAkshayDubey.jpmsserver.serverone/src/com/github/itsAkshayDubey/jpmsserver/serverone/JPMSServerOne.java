package com.github.itsAkshayDubey.jpmsserver.serverone;

import com.github.itsAkshayDubey.jpmsserver.*;
import com.github.itsAkshayDubey.jpmsserver.filter.Filter;
import com.github.itsAkshayDubey.jpmsserver.serverone.internal.ServerOneFilter;
import com.github.itsAkshayDubey.jpmsserver.serverone.internal.ServerOneFilter;

public class JPMSServerOne implements JPMSServer {

    Filter filter = new ServerOneFilter();

    @Override
    public void checkStatus() {
        System.out.println("Checking . . .");
        filter.filter();
        System.out.println("Server one is up and running.");
    }
}
