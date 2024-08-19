package de.fherfurt.bibo.models;

import de.fherfurt.bibo.core.Category;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private String category;
    private String description;
    private String ISBN;
    private boolean isAvailable;

    // Constructor
    public Book(int bookID, String title, String author, String category, String description, String ISBN, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.category = category;
        this.description = description;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getBookID() { return bookID; }
    public void setBookID(int bookID) { this.bookID = bookID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }

    // Methods
    public void borrow() {
        // Implementation for borrowing the book
    }

    public void returnBook() {
        // Implementation for returning the book
    }
}