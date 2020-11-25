package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTwoDimentionTest {
    private ArrayTwoDimention array = new ArrayTwoDimention();

    @Test
    public void testArrayTwoDimentionInitialization() {
        int[][] actual = array.getTwoDim();
        assertNotNull(actual);
        assertEquals(4, actual.length); //length of rows
        assertEquals(5, actual[0].length); //column length of first row
        assertEquals(5, actual[1].length);
        assertNull(actual[2]);
    }

    @Test
    public void testNonRectangularTwoDimentionalInitialization() {
        int[][] actual = array.getNonRectangularTwoDim();
        assertNotNull(actual);
        assertEquals(4, actual.length);
        assertEquals(2, actual[0].length);
        assertNotNull(actual[3]);
    }
}