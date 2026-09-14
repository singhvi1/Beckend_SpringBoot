package com.ms.module1intro;

import com.ms.module1intro.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DependencyInjection {

    //    @Autowired
    NotificationService notificationService;

    /*public DependencyInjection(@Qualifier("sms") NotificationService notificationService) {
        this.notificationService = notificationService;
    }*/

    /*
     public DependencyInjection(NotificationService notificationService) {
        this.notificationService = notificationService;
    }*/

    // using all the beans  implementing NotificationService and autowire All of them :

    @Autowired
    Map<String, NotificationService> NotificationServiceMap = new HashMap<>();


    public static void main(String[] args) {
        SpringApplication.run(DependencyInjection.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {
//            notificationService.send("Hello ");


            for (var notificationService : NotificationServiceMap.entrySet()) {
                System.out.println(notificationService.getKey());
                notificationService.getValue().send("Hello Users ");
            }
        };
    }
}

