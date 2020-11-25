package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfCharTest {

    @Test
    public void TestCreateArray() {
        ArrayOfChar arrayOfChar = new ArrayOfChar();
        char[] actual = arrayOfChar.createArray();
        assertNotNull(actual);
        assertNotNull(actual);
        assertEquals(26, actual.length);
        assertEquals('A', actual[0]);
        assertEquals('Z', actual[25]);
    }
}