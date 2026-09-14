package com.ms.module1intro.impl;

import com.ms.module1intro.services.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms sending ..." + message);
    }
}
