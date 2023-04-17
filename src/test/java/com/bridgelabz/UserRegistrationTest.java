package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @BeforeEach
    void init() {
        userRegistration = new UserRegistration();
    }

    @Test
    void givenExpressionWhenCheckedReturnTrue() throws InvalidRegExException {
        String actualValue = userRegistration.validateFirstName.validFirstName("Naveen");
        Assertions.assertEquals("Valid", actualValue);
    }

    @Test
    void givenExpression1WhenCheckedReturnTrue() throws InvalidRegExException {
            String actualValue = userRegistration.validatelastName.validLastName("Kumar");
            Assertions.assertEquals("Valid", actualValue);

    }

    @Test
    void givenExpression2WhenCheckedReturnTrue() throws InvalidRegExException {
            String actualValue = userRegistration.validateGmail.validGmail("naveen@kumar.com");
            Assertions.assertEquals("Valid", actualValue);
    }

    @Test
    void givenExpression3WhenCheckedReturnTrue() throws InvalidRegExException {

            String actualValue = userRegistration.validateMobile.validMobile("91-7995185400");
            Assertions.assertEquals("Valid", actualValue);

    }

    @Test
    void givenExpression4WhenCheckedReturnTrue() throws InvalidRegExException {
            String actualValue = userRegistration.validatePassword.validPassword("aMveen@123");
            Assertions.assertEquals("Valid", actualValue);
    }
}