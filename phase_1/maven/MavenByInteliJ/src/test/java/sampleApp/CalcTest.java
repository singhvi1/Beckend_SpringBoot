package sampleApp;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalcTest {


    @Test
    public void testCalc() {
        Calc calc = new Calc();

        int actualResult = calc.divide(10, 2);
        int expectedResult = 5;

        assertEquals(expectedResult, actualResult);

    }


}
