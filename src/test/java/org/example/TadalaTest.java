package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TadalaTest {
    @Test
    void testMergeWithOverlappingIntervals() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, Tadala.merge(intervals));
    }

    @Test
    void testMergeWithNonOverlappingIntervals() {
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};
        assertArrayEquals(expected, Tadala.merge(intervals));
    }

    @Test
    void testMergeWithSingleInterval() {
        int[][] intervals = {{1, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, Tadala.merge(intervals));
    }

    @Test
    void testMergeWithNestedIntervals() {
        int[][] intervals = {{1, 10}, {2, 3}, {4, 8}};
        int[][] expected = {{1, 10}};
        assertArrayEquals(expected, Tadala.merge(intervals));
    }

    @Test
    void testMergeWithAdjacentIntervals() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, Tadala.merge(intervals));
    }
}