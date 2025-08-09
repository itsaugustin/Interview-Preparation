package org.example.customexception;

public class InvalidUserIdException extends RuntimeException {
    public InvalidUserIdException(String msg) { super(msg); }
}
