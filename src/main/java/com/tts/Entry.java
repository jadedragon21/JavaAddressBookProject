package com.tts;

import java.util.Objects;

public class Entry {
    //adding Entry Structure Entry Properties
    //variables should be private
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    //construct
    public Entry(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public static Entry createBlankEntry() {
        return new Entry("", "", "", "");
    }

    public static Entry createEntry(String firstName, String lastName, String phoneNumber, String emailAddress) {
        return new Entry(firstName, lastName, phoneNumber, emailAddress);
    }
  //getters & setters
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    // an override of toString()
    @Override
    public String toString() {
        return """
                    |-------------------------------------------------------------|
                    |                         **Entry**                           |
                    |-------------------------------------------------------------|
                    | first name: %s
                    | last name: %s
                    | phone number: %s
                    | email address: %s
                    """.formatted(firstName, lastName, phoneNumber, emailAddress);
    }
  //  more overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(firstName, entry.firstName) && Objects.equals(lastName, entry.lastName) && Objects.equals(phoneNumber, entry.phoneNumber) && Objects.equals(emailAddress, entry.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,phoneNumber,emailAddress);
    }

}
