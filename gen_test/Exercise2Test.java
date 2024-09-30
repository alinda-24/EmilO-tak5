package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise2Test {
    
    @Test
    public void testListPrimesWithPrimesAndNonPrimes() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 5));
        assertEquals(expected, Exercise2.listPrimes(input));
    }

    @Test
    public void testListPrimesWithAllPrimes() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11, 13, 17, 19, 23));
        assertEquals(input, Exercise2.listPrimes(input));
    }

    @Test
    public void testListPrimesWithAllNonPrimes() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 4, 6, 8, 10));
        assertTrue(Exercise2.listPrimes(input).isEmpty());
    }

    @Test
    public void testListPrimesWithNegativeAndZero() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5, -3, 0, 1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        assertEquals(expected, Exercise2.listPrimes(input));
    }

    @Test
    public void testListPrimesWithEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        assertTrue(Exercise2.listPrimes(input).isEmpty());
    }
}

// Exercise4Test.java

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

