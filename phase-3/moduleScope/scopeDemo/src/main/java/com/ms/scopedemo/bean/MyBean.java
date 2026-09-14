package com.ms.scopedemo.bean;

public class MyBean {

    private final String scopeName;

    public MyBean(String scopeName) {
        this.scopeName = scopeName;
        System.out.println(scopeName + " Bean Created");
    }

    public String getScopeName() {
        return scopeName;
    }
}