package com.ms.module1intro;

public class ObjExecutionOrder {
    // 1. Static variable
    static int a = initializeStatic();


    // 2. Static block
    static {
        System.out.println("Static Block");
    }


    // 3. Instance variable
    int b = initializeInstance();

    // 4. Instance initialization block
    {
        System.out.println("Instance Block");
    }


    // 5. Constructor

    ObjExecutionOrder() {
        System.out.println("Constructor");
    }

    // 6. Method
    void display() {

        System.out.println("Method Call");
    }

    static int initializeStatic() {
        System.out.println("Static Variable Initialization");
        return 10;
    }

    int initializeInstance() {
        System.out.println("Instance Variable Initialization");
        return 20;
    }


    public static void main(String[] args) {

        ObjExecutionOrder d = new ObjExecutionOrder();

        d.display();

    }
}
