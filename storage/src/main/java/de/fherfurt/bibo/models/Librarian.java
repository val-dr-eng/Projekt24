package de.fherfurt.bibo.models;

import java.time.LocalDate;

public class Librarian extends Person {

    // Constructor
    public Librarian(int personID, String firstName, String lastName, String phoneNumber, LocalDate birthday, String email, String address) {
        super(personID, firstName, lastName, phoneNumber, birthday, email, address);
    }

    // Methods
    public void addNewPerson(Person person) {
        // Implementation for adding a new person
    }

    public void removePerson(Person person) {
        // Implementation for removing a person
    }

    public void addBook(Book book) {
        // Implementation for adding a new book
    }

    public void removeBook(Book book) {
        // Implementation for removing a book
    }
}

