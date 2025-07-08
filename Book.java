package org.example;
import java.time.Year;

public abstract class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected int publishedYear;
    protected double price;

    public Book(String isbn, String title, String author, int publishedYear, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public abstract boolean isPurchasable();
    public abstract double purchase(int quantity, String email, String address) throws Exception;

    public boolean isOutdated(int yearsThreshold) {
        return Year.now().getValue() - publishedYear > yearsThreshold;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return title + " by " + author + " (" + publishedYear + ") - " + isbn;
    }

}
