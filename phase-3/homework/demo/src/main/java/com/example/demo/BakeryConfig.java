package com.example.demo;

import com.example.demo.imp.CakeBaker;
import com.example.demo.services.Frosting;
import com.example.demo.services.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BakeryConfig {

    @Bean
    @Qualifier("chocolateStrawberryCake")
    public CakeBaker chocolateStrawberryCake(@Qualifier("chocolateFrosting") Frosting frosting, @Qualifier("strawberrySyrup") Syrup syrup) {
        return new CakeBaker(frosting, syrup);
    }

    @Bean
    @Qualifier("strawberryChocolateCake")
    public CakeBaker strawberryChocolateCake(@Qualifier("strawberryFrosting") Frosting frosting, @Qualifier("chocolateSyrup") Syrup syrup) {
        return new CakeBaker(frosting, syrup);

    }
}