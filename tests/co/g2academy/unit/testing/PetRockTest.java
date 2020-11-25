package co.g2academy.unit.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() {
        String actual = rocky.getName();
        assertEquals("Rocky", actual);
    }

    @Test
    public void testUnHappyToStart() {
        PetRock rocky = new PetRock("Rocky");
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay()  {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}