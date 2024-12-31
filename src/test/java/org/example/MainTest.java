package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCalculateSumForPositiveN() {
        assertEquals(15, Main.calculateSum(5)); // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(6, Main.calculateSum(3));  // 1 + 2 + 3 = 6
        assertEquals(1, Main.calculateSum(1));  // 1
    }

    @Test
    void testCalculateSumForZero() {
        assertEquals(0, Main.calculateSum(0)); // Sum of 0 numbers = 0
    }

    @Test
    void testCalculateSumForNegativeN() {
        assertEquals(0, Main.calculateSum(-5)); // Negative input should return 0
    }

}