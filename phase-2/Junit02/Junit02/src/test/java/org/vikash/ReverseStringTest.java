package org.vikash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverse = new ReverseString();

        assertEquals("hsakiV", reverse.reverseString("Vikash"));
    }
}