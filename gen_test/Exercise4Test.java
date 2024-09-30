package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise4Test {

    @Test
    public void testIntersectCollectionsNormalCase() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int[] array = {3, 4, 5, 6};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
        assertEquals(expected, Exercise4.intersectCollections(list, array));
    }

    @Test
    public void testIntersectCollectionsNoIntersection() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int[] array = {4, 5, 6};
        assertTrue(Exercise4.intersectCollections(list, array).isEmpty());
    }

    @Test
    public void testIntersectCollectionsEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = {1, 2, 3};
        assertTrue(Exercise4.intersectCollections(list, array).isEmpty());
    }

    @Test
    public void testIntersectCollectionsEmptyArray() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int[] array = {};
        assertTrue(Exercise4.intersectCollections(list, array).isEmpty());
    }

    @Test
    public void testIntersectCollectionsNullInput() {
        assertThrows(IllegalArgumentException.class, () -> Exercise4.intersectCollections(null, new int[]{1, 2, 3}));
        assertThrows(IllegalArgumentException.class, () -> Exercise4.intersectCollections(new ArrayList<>(), null));
    }
}

// Exercise1Test.java

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

