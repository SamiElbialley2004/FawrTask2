package org.example;

import org.example.Book;


public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int publishedYear, double price, int stock) {
        super(isbn, title, author, publishedYear, price);
        this.stock = stock;
    }

    @Override
    public boolean isPurchasable() {
        return stock > 0;
    }

    @Override
    public double purchase(int quantity, String email, String address) throws Exception {
        if (stock < quantity) {
            throw new Exception("Quantum book store - Not enough stock for PaperBook: " + title);
        }
        stock -= quantity;
        ShippingService.sendTo(address);
        return price * quantity;
    }

    public int getStock() {
        return stock;
    }
}
