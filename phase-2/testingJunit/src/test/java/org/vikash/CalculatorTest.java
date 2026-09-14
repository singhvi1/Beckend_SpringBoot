package org.vikash;

import org.junit.Test;
import org.vikash.learning.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void test() {
        int res = cal.divide(10, 2);
        int exp = 5;
        assertEquals(exp, res);

    }
}
