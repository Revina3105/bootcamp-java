package co.g2academy.oop;
import org.junit.Test;
import static org.junit.Assert.*;
public class MyCalculationTest {
    @Test
    public void testAddition() {
        MyCalculation calculation = new MyCalculation();
        calculation.addition(1, 10);
        int actual = calculation.z;
        assertEquals(11, actual);
    }

    @Test
    public void testSubstraction() {
        Calculation calculation = new Calculation();
        calculation.substraction(9, 2);
        int actual = calculation.z;
        assertEquals(7, actual);
    }

    @Test
    public void testMultiplication() {
        MyCalculation calculation = new MyCalculation();
        calculation.multiplication(1, 10);
        int actual = calculation.z;
        assertEquals(10, actual);
    }
}