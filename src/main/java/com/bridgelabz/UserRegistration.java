package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    Scanner input = new Scanner(System.in);
//    @Override
    public ValidateFirstName validateFirstName=(String firstName) -> {
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        try {
            if (matcher.matches())
                return "Valid";
            else
                throw new InvalidRegExException("Enter Valid FirstName : ");
        } catch (InvalidRegExException e) {
            System.out.println(e);
            e.printStackTrace();
            return "Invalid";
        }
    };

    public ValidateLastName validatelastName=(String lastName)-> {
        Pattern pattern = Pattern.compile("^[A-Z]+[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        try {
            if (matcher.matches())
                return "Valid";
            else
                throw new InvalidRegExException("Enter Valid LastName : ");
        } catch (InvalidRegExException e) {
            System.out.println(e);
            e.printStackTrace();
            return "Invalid";
        }
    };

    public ValidateGmail validateGmail=(String gmail)-> {
        Pattern pattern = Pattern.compile("^[a-z0-9]+@[a-z]+.[a-z]+$");
        Matcher matcher = pattern.matcher(gmail);
        try {
            if (matcher.matches())
                return "Valid";
            else
                throw new InvalidRegExException("Enter Valid LastName : ");
        } catch (InvalidRegExException e) {
            System.out.println(e);
            e.printStackTrace();
            return "Invalid";
        }
    };

    public ValidateMobile validateMobile=(String mobile) -> {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobile);
        try {
            if (matcher.matches())
                return "Valid";
            else
                throw new InvalidRegExException("Enter Valid LastName : ");
        } catch (InvalidRegExException e) {
            System.out.println(e);
            e.printStackTrace();
            return "Invalid";
        }
    };

    public ValidatePassword validatePassword=(String password) -> {
        Pattern pattern = Pattern.compile("^(?=.*[a-z]*[A-Z]*[0-9(?=.[-+_!@#$%^&*.,?])]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        try {
            if (matcher.matches())
                return "Valid";
            else
                throw new InvalidRegExException("Enter Valid LastName : ");
        } catch (InvalidRegExException e) {
            System.out.println(e);
            e.printStackTrace();
            return "Invalid";
        }

    };
}