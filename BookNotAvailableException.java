package org.example;
public class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super("Quantum book store - " + message);
    }
}
