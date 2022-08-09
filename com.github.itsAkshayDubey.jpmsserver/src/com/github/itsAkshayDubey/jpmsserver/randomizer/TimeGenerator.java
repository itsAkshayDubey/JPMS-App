package com.github.itsAkshayDubey.jpmsserver.randomizer;

import java.util.Random;

public class TimeGenerator {

    public static int getTime(){
        Random r = new Random();
        int low = 1000;
        int high = 10000;
        return r.nextInt(high-low) + low;
    }
}
