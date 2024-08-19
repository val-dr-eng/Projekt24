package de.fherfurt.bibo.models;

import java.time.LocalDate;

public class Person {
    private int personID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate birthday;
    private String email;
    private String address;

    // Constructor
    public Person(int personID, String firstName, String lastName, String phoneNumber, LocalDate birthday, String email, String address) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public int getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public LocalDate getBirthday() { return birthday; }
    public void setBirthday(LocalDate birthday) { this.birthday = birthday; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Methods
    public void searchBooks() {
        // Implementation for searching books
    }

    public void borrowBook(Book book) {
        // Implementation for borrowing a book
    }

    public void returnBook(Book book) {
        // Implementation for returning a book
    }
}
