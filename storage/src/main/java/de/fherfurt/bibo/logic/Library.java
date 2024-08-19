package de.fherfurt.bibo.logic;

import de.fherfurt.bibo.models.Book;
import de.fherfurt.bibo.models.Person;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<Person> persons;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.persons = new ArrayList<>();
    }

    // Methods to manage books
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    // Methods to manage persons
    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    // Method for searching books
    public List<Book> searchBooks() {
        // Currently returns all books; could be extended for specific search criteria
        return books;
    }
}