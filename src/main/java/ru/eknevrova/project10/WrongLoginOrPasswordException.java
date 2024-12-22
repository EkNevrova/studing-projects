package ru.eknevrova.project10;

public class WrongLoginOrPasswordException extends Exception{
    public WrongLoginOrPasswordException() {
        super();
    }

    public WrongLoginOrPasswordException(Exception cause) {
        super(cause);
    }

    public WrongLoginOrPasswordException(String message) {
        super(message);
    }

    public WrongLoginOrPasswordException(String message, Exception cause) {
        super(message, cause);
    }
}
