package com.github.itsAkshayDubey.jpmsserver.randomizer;

import java.util.Random;

public class BooleanGenerator {

    public static boolean getBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

}
