package com.ms.module1intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService paymentService() {
        return new PaymentService();
    }

}

//used when we are using any third party lin/module/class where we cant put @component on that calss
