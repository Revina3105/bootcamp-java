package co.g2academy.exceptionHandilng;

import co.g2academy.exceptionHandling.AgeValidator;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AgeValidatorTest {
    AgeValidator validator = new AgeValidator();

    @Test
    public void testValidateValidator() {
        boolean actual = validator.validate(25);
        assertTrue(actual);
    }

    @Test
    public void testInvalidAgeValidator() {
        try {
            validator.validate(10);
           // assertTrue(false);
        }catch (ArithmeticException e){
            assertTrue(true);
        }
    }

    @Test
    public void testHandleCheckedExceptionWithTryAndCatch() {
        try {
            boolean actual = validator.validateGender("male");
            assertTrue(actual);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Test // call the method previous, cara yg tidak baik, karna tidak mau handle exception
    public void testHandleCheckedExceptionWithThrowItFurtherToMethodCaller ()
            throws FileNotFoundException {
        boolean actual = validator.validateGender("female");
    }

}