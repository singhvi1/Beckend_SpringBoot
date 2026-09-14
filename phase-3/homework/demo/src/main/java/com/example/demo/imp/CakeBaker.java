package com.example.demo.imp;

import com.example.demo.services.Frosting;
import com.example.demo.services.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


//@Component
public class CakeBaker {

    private Frosting frosting;
    private Syrup syrup;


//    public CakeBaker(@Qualifier("chocolateFrosting") Frosting frosting, @Qualifier("strawberrySyrup") Syrup syrup) {
//        this.frosting = frosting;
//        this.syrup = syrup;
//    }
    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking Cake");
        System.out.println(frosting.getFrostingType());
        System.out.println(syrup.getSyrupType());
    }
}
