package com.tts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressBook2 {

    // field: an ArrayList of generic type Entries
    private static List<Entry> myAddressBook = new ArrayList<>();
    //    public static void main(String[] args) {
    // methods: ways to manipulate the array list
    // Bobbin Threadbare adds a new pattern....(newEntry)
    public static void addEntry( Entry newEntry) {
        myAddressBook.add(newEntry);
        System.out.println(newEntry);
    }
    // Bobbin Threadbare adds all the patterns....(addAll)
    public static void addAll(Entry... args) {
        myAddressBook.addAll(Arrays.asList(args));
    }
    // Bobbin Threadbare removes the patterns....(removeEntry)
    public static String removeEntry(Entry newEntry) {
        var wasDeleted = myAddressBook.remove(newEntry);
        if (wasDeleted) {
            return "\nEntry was turned into straw and set on fire in the Dragon's Cave!\n";
        }
        return "The Dragon was very angry and scared...She will get her revenge!";
    }
    // Bobbin Threadbare snatches the patterns....(removeAll)
    public static void removeAll() {
        myAddressBook.clear();
        System.out.print("Address Book was cleared!\nYou have torn the Pattern asunder and now Chaos is on the loose!\n");
    }
    // Bobbin Threadbare finds the patterns....(findEntry)
    public static Entry findEntry(String email) {
        return myAddressBook.stream()
                .filter(entry -> entry.getEmailAddress().equals(email))
                .findFirst()
                .orElseThrow();
    }



    // Bobbin Threadbare prints the patterns....(printAll)

    public static void printAll() {
        myAddressBook.forEach(System.out::println);
    }


//extras

    public void AddressBook() {
        addDefaultSilent();
        System.out.println("Welcome to the Stan's Address Book!");
        engageNumberOne();
        System.out.println("Thank you for coming on by! Hope you found who you wanted to find!");
    }

    private void addDefaultSilent() {
    }

    private void engageNumberOne() {
        boolean forgingAhead = true;
        while (forgingAhead) {
            pressEnterKey();
        }
    }

    private void pressEnterKey(){
        System.out.print("Press the Enter key to continue.");

    }

}
