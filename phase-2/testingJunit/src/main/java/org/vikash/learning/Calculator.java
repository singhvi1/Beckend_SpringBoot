package org.vikash.learning;

public class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("divisor cant be zero");
        }
        return a / b;
    }
}
