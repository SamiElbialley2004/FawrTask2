package org.example;

import org.example.Book;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int publishedYear, double price, String fileType) {
        super(isbn, title, author, publishedYear, price);
        this.fileType = fileType;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public double purchase(int quantity, String email, String address) throws Exception {
        MailService.sendTo(email);
        return price * quantity;
    }
}
