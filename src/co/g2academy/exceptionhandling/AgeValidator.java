package co.g2academy.exceptionHandling;

import java.io.FileNotFoundException;

public class AgeValidator {

    public boolean validate(int age){
        if (age < 18) { // no need throws keywords
            //unchecked exception
            throw new ArithmeticException("age is not vallid");
        } else {
            return true;
        }
    }

    public boolean validateGender(String gender) throws FileNotFoundException {

        if (gender.equals("male") || gender.equals("female")){
            return true;
        } else {
            throw new FileNotFoundException("Gender is not Found");
        }
    }
}
