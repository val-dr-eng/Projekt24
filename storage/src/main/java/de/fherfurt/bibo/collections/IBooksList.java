package de.fherfurt.bibo.collections;

import de.fherfurt.bibo.models.Book;

public interface IBooksList extends Iterable<Book> {
    int getAmountBooks();
    void addBook(Book book);
    Book getBook(int index);
    boolean containsBooks(Book book);
    void removeBook(Book book);
}
