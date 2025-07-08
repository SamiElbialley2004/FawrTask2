package org.example;


public class Main {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book paper = new PaperBook("P123", "Java for Beginners", "Alice", 2018, 50, 10);
        Book ebook = new EBook("E456", "Mastering AI", "Bob", 2021, 30, "PDF");
        Book demo = new DemoBook("S789", "Quantum Mechanics Demo", "Dr. Q", 2010);

        store.addBook(paper);
        store.addBook(ebook);
        store.addBook(demo);

        store.removeOutdatedBook("S789", 10);

        try {
            store.buyBook("P123", 2, "buyer@example.com", "123 Street");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("E456", 1, "buyer@example.com", null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("S789", 1, "buyer@example.com", null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
