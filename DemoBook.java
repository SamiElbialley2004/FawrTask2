package org.example;

import org.example.Book;

public class DemoBook extends Book {
    public DemoBook(String isbn, String title, String author, int publishedYear) {
        super(isbn, title, author, publishedYear, 0);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }

    @Override
    public double purchase(int quantity, String email, String address) throws Exception {
        throw new UnsupportedOperationException("Quantum book store - ShowcaseBook is not for sale.");
    }
}
