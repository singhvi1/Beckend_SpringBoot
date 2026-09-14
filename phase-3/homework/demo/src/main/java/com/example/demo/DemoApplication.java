package com.example.demo;

import com.example.demo.imp.CakeBaker;
import com.example.demo.imp.frosting.ChocolateFrosting;
import com.example.demo.imp.syrup.StrawberrySyrup;
import com.example.demo.services.Frosting;
import com.example.demo.services.Syrup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {

            CakeBaker cb = context.getBean("chocolateStrawberryCake", CakeBaker.class);
            CakeBaker cb1 = context.getBean("strawberryChocolateCake", CakeBaker.class);
            cb.bakeCake();
            System.out.println("--------------------");
            cb1.bakeCake();

//            CakeBaker cb = context.getBean(CakeBaker.class);
//            cb.bakeCake();
        };
    }
}
