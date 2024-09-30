package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise1Test {

    @Test
    public void testFindMinMaxNormalCase() {
        int[] input = {3, 5, 1, 2, 9};
        int[] expected = {1, 9};
        assertArrayEquals(expected, Exercise1.findMinMax(input));
    }

    @Test
    public void testFindMinMaxSingleElement() {
        int[] input = {7};
        int[] expected = {7, 7};
        assertArrayEquals(expected, Exercise1.findMinMax(input));
    }

    @Test
    public void testFindMinMaxNegativeValues() {
        int[] input = {-5, -1, -7};
        int[] expected = {-7, -1};
        assertArrayEquals(expected, Exercise1.findMinMax(input));
    }

    @Test
    public void testFindMinMaxEmptyArray() {
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () -> Exercise1.findMinMax(input));
    }

    @Test
    public void testFindMinMaxNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Exercise1.findMinMax(null));
    }
}

// StatisticsTest.java

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

