package com.ms.module1intro.impl;

import com.ms.module1intro.services.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sending ... " + message);
    }
}
