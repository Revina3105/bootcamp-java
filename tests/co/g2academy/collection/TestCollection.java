package co.g2academy.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCollection {

    @Test
    public void testUsingAddAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vina");
        list.add("Utami");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Sonoo");
        secondList.add("Hanumat");

        list.addAll(secondList);

        int actual = list.size();
        assertEquals(5, actual);
    }

    @Test
    public void testUsingRemoveAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vina");
        list.add("Utami");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        list.removeAll(secondList);

        int actual = list.size();
        assertEquals(2, actual);
    }

    @Test
    public void testUsingRetainAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vina");
        list.add("Utami");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        list.retainAll(secondList);

        int actual = list.size();
        assertEquals(1, actual);
        String actualRavi = list.get(0);
        assertEquals("Ravi", actualRavi);
    }
}