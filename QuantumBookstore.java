package org.example;

import java.util.*;

public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store - Added book: " + book);
    }

    public Book removeOutdatedBook(String isbn, int years) {
        Book book = inventory.get(isbn);
        if (book != null && book.isOutdated(years)) {
            inventory.remove(isbn);
            System.out.println("Quantum book store - Removed outdated book: " + book);
            return book;
        }
        return null;
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new BookNotAvailableException("Book with ISBN " + isbn + " not found.");
        }

        if (!book.isPurchasable()) {
            throw new BookNotAvailableException("Book with ISBN " + isbn + " is not purchasable.");
        }

        double cost = book.purchase(quantity, email, address);
        System.out.println("Quantum book store - Book purchased. Total cost: " + cost);
        return cost;
    }
}
