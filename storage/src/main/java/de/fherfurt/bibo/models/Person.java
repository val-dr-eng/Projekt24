package de.fherfurt.bibo.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate birthDate;
    private String email;
    private String address;
    private ArrayList<Integer> loanIndexList;

    public Person(String firstName, String lastName, String phoneNumber, LocalDate birthDate, String email,  String address, int loanIndex, ArrayList<Integer> loanIndexList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.loanIndexList = loanIndexList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Integer> getLoanIndexList() {
        return loanIndexList;
    }

    public void setLoanIndexList(ArrayList<Integer> loanIndexList) {
        this.loanIndexList = loanIndexList;
    }
}
