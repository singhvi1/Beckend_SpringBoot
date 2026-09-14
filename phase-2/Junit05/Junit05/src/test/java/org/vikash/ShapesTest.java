package org.vikash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    void testComputeSquareArea() {
        assertEquals(64, shape.computeSquareArea(8), 0.001);
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(78.5, shape.computeCircleArea(5), 0.001, "Area of circle is failing");
    }
}