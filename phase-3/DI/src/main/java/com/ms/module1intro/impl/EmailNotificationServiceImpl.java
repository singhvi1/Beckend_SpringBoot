package com.ms.module1intro.impl;

import com.ms.module1intro.services.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.type", havingValue = "email", matchIfMissing = true)

public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sending ... " + message);
    }
}


//matchIfMissing : if there will no notificatin.type then set it as default;