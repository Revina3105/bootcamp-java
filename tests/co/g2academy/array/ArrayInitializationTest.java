package co.g2academy.array;

import co.g2academy.basic.MyDate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ArrayInitializationTest {

    private ArrayInitialization array = new ArrayInitialization();

    @Test
    public void testNamesInitializations() {
        String[] actual = array.getNames();
        assertNotNull(actual);
        assertEquals(3, actual.length);
        assertEquals("Giorgiana", actual[0]);
    }

    @Test
    public void testSimpleNamesInitializations() {
        String[] actual = array.getSimpleNames();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }

    @Test
    public void testDatesInitializations() {
        MyDate[] actual = array.getDates();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }

    @Test
    public void testSimpleDateInitializations() {
        MyDate[] actual = array.getSimpleDates();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }
}