package co.g2academy.collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TestBinarySearch {

    @Test
    public void testBinarySearch() {
        Integer[] list ={3, 7, 10, 15, 91, 110, 150};
        int target = 91;

        List<Integer> sortedList = Arrays.asList(list);
        int actual = Collections.binarySearch(sortedList, target);
        assertEquals(4, actual);
    }

    @Test
    public void testSortedListAndBinarySearch() {
        Integer[] list ={192, 91, 0, 15, 34, 1000, 2};
        int target = 91;

        Arrays.sort(list); //sorting array using bubble sort
        List<Integer> sortedList = Arrays.asList(list);
        int actual = Collections.binarySearch(sortedList, target);

        assertEquals(4, actual);
    }

    @Test
    public void testUsingHashSet() {
        //unique
        HashSet<Integer> set = new HashSet<>();
        set.add(192); set.add(91); set.add(0); set.add(15);
        set.add(34); set.add(1000); set.add(2);
        int target = 91;
        boolean actual = set.contains(target);
        assertTrue(actual);
    }

    @Test
    public void testUsingTreeSet() {
        //unique, terurut
        TreeSet<Integer> set = new TreeSet<>();
        set.add(192); set.add(91); set.add(0); set.add(15);
        set.add(34); set.add(1000); set.add(2);
        int target = 91;
        boolean actual = set.contains(target);
        assertTrue(actual);
    }

}
