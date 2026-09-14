package com.vikash.teluskoAppBysite.services;

import org.springframework.stereotype.Service;

import java.time.LocalTime;


@Service
public class GreetingService implements IGreetingServices {
    @Override
    public String generateGreeting() {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour < 12) {
            return "Good Morning ";
        } else if (hour < 16) {
            return "Good AfterNoon";
        } else {
            return "Good Night";
        }
    }
}
