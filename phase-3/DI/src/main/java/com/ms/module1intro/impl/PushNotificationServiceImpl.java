package com.ms.module1intro.impl;

import com.ms.module1intro.services.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


//@ConditionalOnProperty(name = "notification.type", havingValue = "pushNotification")
@Component
public class PushNotificationServiceImpl implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("pushNotification sending ... " + message);

    }
}
