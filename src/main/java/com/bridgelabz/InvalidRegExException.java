package com.bridgelabz;

import java.util.function.Predicate;

public class InvalidRegExException extends Exception{
    public InvalidRegExException(String message) {
        super(message);
    }
}