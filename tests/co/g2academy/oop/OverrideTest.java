package co.g2academy.oop;
import org.junit.Test;
import static org.junit.Assert.*;
public class OverrideTest {
    @Test
    public void testMethodMoveOverriding() {
        Animal animal = new Animal();
        String actual = animal.move();
        assertEquals("Animals can move", actual);

        Animal mammal = new Mammal();
        actual = mammal.move();
        assertEquals("Mammal can walk and run", actual);
    }
}