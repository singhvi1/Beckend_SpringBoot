package org.vikash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    Shapes shape = new Shapes();

//    @Test
//    void testComputeSquareArea() {
//        assertEquals(64, shape.computeSquareArea(8), 0.001);
//    }
//
//    @Test
//    void testComputeCircleArea() {
//        assertEquals(7, shape.computeCircleArea(5), 0.001, "Area of circle is failing");
//    }
//
//    @Test
//    void testComputeCircleArea_Supplier() {
//        assertEquals(7.5, shape.computeCircleArea(5), 0.001, () -> "Area of circle is failing");
//    }
    @Test
    void testComputeSquareArea() {
        assertNotEquals(64, shape.computeSquareArea(7), 0.001);
    }

    @Test
    void testComputeCircleArea() {
        assertNotEquals(7, shape.computeCircleArea(5), 0.001, "Area of circle is failing");
    }

    @Test
    void testComputeCircleArea_Supplier() {
        assertNotEquals(7.5, shape.computeCircleArea(5), 0.001, () -> "Area of circle is failing");
    }
}