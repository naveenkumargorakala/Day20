package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    Scanner input = new Scanner(System.in);

    public String firstName(String FirstName) {
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2}[A-Za-z]*");

        Matcher matcher = pattern.matcher(FirstName);
        if (matcher.matches())
            return "Valid";
        else
            return "Invalid";
    }

    public String lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2}[A-Za-z]*");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches())
            return "Valid";
        else
            return "Invalid";
    }

    public String gmail(String gmail) {
        Pattern pattern = Pattern.compile("^[a-z0-9]+@[a-z]+.[a-z]+$");
        Matcher matcher = pattern.matcher(gmail);
        if (matcher.matches())
            return "Valid";
        else
            return "Invalid";
    }

    public String mobile(String mobile) {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{10}$");

        Matcher matcher = pattern.matcher(mobile);
        if (matcher.matches())
            return "Valid";
        else
            return "Invalid";
    }

    public String password(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z]*[A-Z]*[0-9(?=.[-+_!@#$%^&*.,?])]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return "Valid";
        else
            return "Invalid";
    }

}