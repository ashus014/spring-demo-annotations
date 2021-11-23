package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Formula1Coach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Use DRS only in DRS Zones";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
