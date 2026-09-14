package com.example.demo.imp.frosting;

import com.example.demo.services.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("strawberryFrosting")
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Frosting: Strawberry";
    }
}
