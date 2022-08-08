package com.github.itsAkshayDubey.jpmsserver.servertwo.filter;

import com.github.itsAkshayDubey.jpmsserver.filter.Filter;

public class ServerTwoFilter implements Filter {
    @Override
    public void filter() {
        System.out.println("Applying filter for server two...");
    }
}
