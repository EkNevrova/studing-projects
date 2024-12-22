package ru.eknevrova.project10;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(Exception cause) {
        super(cause);
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(String message, Exception cause) {
        super(message, cause);
    }
}
