package com.tester.solution.exception;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(final String message) {
        super(message);
    }
}
