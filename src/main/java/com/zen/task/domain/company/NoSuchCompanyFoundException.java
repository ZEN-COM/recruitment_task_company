package com.zen.task.domain.company;

public class NoSuchCompanyFoundException extends RuntimeException {

    public NoSuchCompanyFoundException(final String message) {
        super(message);
    }
}
