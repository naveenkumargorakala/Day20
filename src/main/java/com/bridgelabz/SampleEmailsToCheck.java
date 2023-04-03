package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailsToCheck {
    Scanner input = new Scanner(System.in);

    public boolean testGmail(String testGmail) {
        Pattern pattern = Pattern.compile("^[a-z0-9%!@#$^&*():;|<>,+.-]+@[a-z0-9.]+$");
        Matcher matcher = pattern.matcher(testGmail);

        if (matcher.matches())
            return true;
        else
            return false;
    }
}
