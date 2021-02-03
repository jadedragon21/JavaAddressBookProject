package com.tts;

import java.util.Scanner;

public class Main {
    //print entries here

    //reference to your database
    //add user interface here
    // build the input scanner
    //scanner obj

    private static final Scanner redQueenInSpace = new Scanner(System.in);

    public static void main(String[] args) {
        //default address book
        AddressBook2.addAll(
                new Entry("Bobbin",
                        "Threadbare",
                        "111-888-1111",
                        "LoomChild@gmail.com"),
                new Entry("Cygna",
                        "Threadbare",
                        "666-666-6666",
                        "ShoreofWonder@gmail.com"),
                new Entry("Fleece",
                        "Firmflanks",
                        "555-555-5555",
                        "FirstChosenGofS@ifleece.com"),
                new Entry("Rusty",
                        "NailBender",
                        "234-421-1235",
                        "ApprenticeBlacksmith@iSteelMarkers.com"),
                new Entry("Hetchel",
                        "ElderDuck",
                        "515-245-5345",
                        "RoastedDuckElder@escape.com")
        );


        Scanner redQueenInLoom = new Scanner(System.in);
        System.out.println("Welcome to the Main Menu.\n");
        System.out.println("Bobbin's Personal Address Book\n");
        pressEnterKey();
        System.out.println("\n");
        System.out.println("Welcome to Bobbin Threadbare's Forgotten Little Address Book\n");
        System.out.println("Please help him make new friends by adding yourself to his address book...\n");
        System.out.println("You can also add your friends as well so poor little Bobbin can expand his non-existent circle.\n");
        System.out.println("He lives on an small rocky island. All of the elders have been turned into swans and Hetchel was turned into a duck.\n");
        System.out.println("I, the Red Queen, beseech you to make the son of Cygna's little address book full\nso that he can have friends in the Shore of Wonder when he finishes saving the world of Loom.\n");
        System.out.println("For the Son of Cygna's record of his heroism please watch his exploits at https://www.youtube.com/watch?v=ps1N2GS378g.\nDon't forget to like and subscribe!");
        System.out.println("\n");
        System.out.println("Secret Little Address Book inside the Loom");
        UserPrompts.makeSelection(redQueenInLoom);
        System.out.println("Your Choice:");
        pressEnterKey();

    }


    boolean correctAnswer = false;
    String userReply = "";
    boolean forgingAhead = true;

    {
        int usersChoice = 0;
        correctAnswer = false;
        while (!correctAnswer) {


            try {
                usersChoice = Integer.parseInt(userReply);
                correctAnswer = true;
            } catch (NumberFormatException err) {
                if (userReply.contains("q")) {
                    correctAnswer = true;
                    forgingAhead = false;
                    System.out.println("I quit...this program that is...Gotcha!");
                } else {
                    System.out.println("Doh! There was an error: " + err);
                    System.out.println("That reply was wrong. Please try again...");
                    correctAnswer = false;
                }
            }

        }
        switch (usersChoice) {
            case 0 -> System.out.println("Cobb said....Would you like to know more about loom tm?");

            case 1 -> beginStansAddressBook();
            default -> System.out.println("Please enter the correct one! You replied with: " + userReply);
        }


    }


    private static void beginStansAddressBook() {
        System.out.println("Launching Bobbin's Address Book!");
        pressEnterKey();

        new AddressBook2();
    }

    private static void pressEnterKey() {
        System.out.print("Press the Enter key to continue.");
        redQueenInSpace.nextLine();


    }
}
