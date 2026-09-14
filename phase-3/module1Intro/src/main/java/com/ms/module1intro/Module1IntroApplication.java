package com.ms.module1intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.*;

@SpringBootApplication
public class Module1IntroApplication implements CommandLineRunner {
    @Autowired
    PaymentService paymentServiceObj;

    public static void main(String[] args) {

        SpringApplication.run(Module1IntroApplication.class, args);
//        PaymentService ps = new PaymentService();
//        ps.pay();

    }

    @Override
    public void run(String... args) throws Exception {
        //paymentServiceObj.pay();

        // Greeting greet = new Greeting();
        // greet.generateWish();

        /*
         * static variable initialization
         *Static block
         *instance variable initialization
         *NonStatic/instace block initialization
         *Constructor
         *instance variable initialization
         *NonStatic/instace block initialization
         *Constructor
         *method call
         */
    }

    @Bean
    public CommandLineRunner runner(Greeting greet) {
        return args -> {
            System.out.println("--Inside CommandLineRunner---");
            greet.generateWish();
        };
    }

}




    /*
        *static variable initialization
        *Static block
        *instance variable initialization
        *NonStatic/instace block initialization
        *Constructor
        *Bean init method
        --Inside CommandLineRunner---
        *method call
        *Bean destroyed
     */
