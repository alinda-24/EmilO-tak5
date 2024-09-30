package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatisticsTest {

    @Test
    public void testMeanNormalCase() {
        int[] input = {1, 2, 3, 4, 5};
        double expected = 3.0;
        assertEquals(expected, Statistics.mean(input), 0.001);
    }

    @Test
    public void testMeanSingleElement() {
        int[] input = {42};
        double expected = 42.0;
        assertEquals(expected, Statistics.mean(input), 0.001);
    }

    @Test
    public void testMeanNegativeValues() {
        int[] input = {-3, -7, -1};
        double expected = -3.6667;
        assertEquals(expected, Statistics.mean(input), 0.001);
    }

    @Test
    public void testMeanEmptyArray() {
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () -> Statistics.mean(input));
    }

    @Test
    public void testMeanNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Statistics.mean(null));
    }

    @Test
    public void testMedianNormalCaseOddLength() {
        int[] input = {1, 3, 2};
        double expected = 2.0;
        assertEquals(expected, Statistics.median(input), 0.001);
    }

    @Test
    public void testMedianNormalCaseEvenLength() {
        int[] input = {1, 2, 3, 4};
        double expected = 2.5;
        assertEquals(expected, Statistics.median(input), 0.001);
    }

    @Test
    public void testMedianSingleElement() {
        int[] input = {5};
        double expected = 5.0;
        assertEquals(expected, Statistics.median(input), 0.001);
    }

    @Test
    public void testMedianEmptyArray() {
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () -> Statistics.median(input));
    }

    @Test
    public void testMedianNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Statistics.median(null));
    }
}