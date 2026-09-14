package com.example.demo.imp.syrup;

import com.example.demo.services.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("strawberrySyrup")
public class StrawberrySyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Syrup: Strawberry";
    }
}
