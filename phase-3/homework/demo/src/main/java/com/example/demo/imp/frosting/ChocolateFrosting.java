package com.example.demo.imp.frosting;

import com.example.demo.services.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chocolateFrosting")
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Frosting: Chocolate";
    }
}
