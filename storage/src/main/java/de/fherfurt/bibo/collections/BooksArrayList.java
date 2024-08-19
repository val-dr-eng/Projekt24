package de.fherfurt.bibo.collections;

import de.fherfurt.bibo.models.Book;

public class BooksArrayList implements IBooksList{
    private final Book[] books;
    private int amountBooks;
    public static final int BOOKS_MAX_SIZE = 1000000;

    public BooksArrayList() {
        this.books = new Book[BOOKS_MAX_SIZE];
        this.amountBooks = 0;
    }
}
}
