package com.ms.module1intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class Greeting {
    static int a = initStaticVar();

    static {
        System.out.println("Static block");
    }

    int b = initVar();

    {
        System.out.println("Non Static/instace block initialization");
    }

    public Greeting() {
        System.out.println("Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean init method");
    }

    // method call ;
    public String generateWish() {
        System.out.println("method call");
        return "";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroyed ");
    }

    private int initVar() {
        System.out.println("instance variable initialization");
        return 0;
    }

    private static int initStaticVar() {
        System.out.println("static variable initialization");
        return 10;
    }
}
