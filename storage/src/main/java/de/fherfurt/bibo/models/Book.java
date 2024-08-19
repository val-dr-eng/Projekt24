package de.fherfurt.bibo.models;

import de.fherfurt.bibo.core.Category;

public class Book {
    private String title;
    private String author;
    private boolean borrowed;
    private String isbn;
    private String articleNumber;

    private Category category;

    public Book(String title, String author, boolean borrowed, String isbn, String articleNumber,Category category) {
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
        this.isbn = isbn;
        this.articleNumber = articleNumber;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }
}
