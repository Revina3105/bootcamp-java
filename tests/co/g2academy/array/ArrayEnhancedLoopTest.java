package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEnhancedLoopTest {
    private ArrayEnhancedLoop array = new ArrayEnhancedLoop();

    @Test
    public void testSumAllItemsInArrayOfInteger() {
        int actual = array.calculateSumOfAllItems();
        assertEquals(30, actual);
    }

    @Test
    public void testMultiplicationInArrayOfInteger() {
        int actual = array.calculateMultiplicationOfAllItem();
        assertEquals(2400, actual);
    }

    //average

    @Test
    public void test_average_all_in_array() {
        int actual = array.calculateAverageOfAllItems();
        assertEquals(6, actual);
    }
}