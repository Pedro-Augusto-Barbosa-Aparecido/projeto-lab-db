package com.pedro.exceptions;

public class InvalidField extends Exception {
    public InvalidField() {
    }

    public InvalidField(String message) {
        super(message);
    }

    public InvalidField(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidField(Throwable cause) {
        super(cause);
    }

    public InvalidField(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
