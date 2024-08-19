package de.fherfurt.bibo.logic;

public class Library {
    private final BooksList books;

    public Library(BooksList books) {
        this.books = books;
    }
    public Library(){
        this(new BooksList());
    }

    public BooksList getBooks() {
        return books;
    }
    public Book findBookWithIsbn(String isbn) {
        // TODO: Implement
        return null;
    }
    public BooksList findAllBooksWithAuthor(String author) {
        //TODO: Implement
        return null;
    }
    public BooksList findAllBooksWithCategory(String category) {
        //TODO: Implement
        return null;
    }
}
