package com.example.demo.imp.syrup;

import com.example.demo.services.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chocolateSyrup")
public class ChocolateSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Syrup: Chocolate";
    }
}
