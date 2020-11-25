package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayResizingTest {
    @Test
    public void testArrayResizing() {

        int[] initialArray = {1,2,3}; //resize from 3 to 5
        ArrayResizing array = new ArrayResizing();
        int[] actual = array.resize(initialArray, 5);
        assertNotNull(actual);
        assertEquals(5, actual.length);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
        assertEquals(3, actual[2]);

    }
}