package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    UserRegistration userRegistration;
    @BeforeEach
    void init(){
        System.out.println("onl;y");
        userRegistration = new UserRegistration();
    }
    @Test
    void givenExpressionWhenCheckedReturnTrue(){
        String actualValue = userRegistration.firstName("Naveen");
        Assertions.assertEquals("Valid",actualValue);
    }
    @Test
    void givenExpression1WhenCheckedReturnTrue(){
        String actualValue= userRegistration.lastName("Kumar");
        Assertions.assertEquals("Valid",actualValue);
    }
    @Test
    void givenExpression2WhenCheckedReturnTrue(){
        String actualValue= userRegistration.gmail("naveen@kumar.com");
        Assertions.assertEquals("Valid",actualValue);
    }
    @Test
    void givenExpression3WhenCheckedReturnTrue(){
        String actualValue= userRegistration.mobile("91-7995185400");
        Assertions.assertEquals("Valid",actualValue);
    }
    @Test
    void givenExpression4WhenCheckedReturnTrue(){
        String actualValue= userRegistration.password("aMveen@123");
        Assertions.assertEquals("Valid",actualValue);
    }
}
