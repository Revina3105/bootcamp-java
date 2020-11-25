package co.g2academy.oop;
import org.junit.Test;
import static org.junit.Assert.*;
public class SalaryTest {
    @Test
    public void testPlymorphimInMethod() {
        Employee employee = new Employee("Revina", "Jakarta", 123);
        String actual = employee.mailCheck();
        assertEquals("Mailing check to Revina Jakarta", actual);

        Employee salary = new Salary("Revina", "Jakarta", 123, 2300);
        actual = salary.mailCheck();
        assertEquals("Within mailCheck of Salary class. Mailing check to Revina Jakarta", actual);
    }

    @Test
    public void testAvoidSettingSalaryToNegativeNumber() {
        Salary salary = new Salary("Revina", "Jakarta", 123, 2300);
        salary.setSalary(-1);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(2300), Double.valueOf(actual));
    }

    @Test
    public void testSettingSalaryUsingPositiveNumber() {
        Salary salary = new Salary("Revina", "Jakarta", 123, 2300);
        salary.setSalary(1_000_000);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(1_000_000), Double.valueOf(actual));
    }
}