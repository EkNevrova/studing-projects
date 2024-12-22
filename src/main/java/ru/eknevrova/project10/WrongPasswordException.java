package ru.eknevrova.project10;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(Exception cause) {
        super(cause);
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, Exception cause) {
        super(message, cause);
    }
}
