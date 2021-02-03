package com.tts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserPrompts {
    private static void selectionOne(Scanner redQueenInLoom) {
        System.out.print("Please enter a first name: \n");
        var firstName = redQueenInLoom.next();
        System.out.print("Please enter a last name: \n");
        var lastName = redQueenInLoom.next();
        System.out.print("Please enter a phone number: \n");
        var phoneNumber = redQueenInLoom.next();
        System.out.print("Please enter an email address: \n");
        var emailAddress = redQueenInLoom.next();

        System.out.print("Adding entry...\n");
        AddressBook2.addEntry(new Entry(firstName, lastName, phoneNumber, emailAddress));
        System.out.print("Entry added! Sending you to main screen...\n");
        redQueenInLoom.nextLine();
        makeSelection(redQueenInLoom);
    }

    private static void exitSystem() {
        System.exit(0);

    }

    public static void makeSelection(Scanner redQueenInLoom) {
        var options =
                """
                                        
                        Here are your options:
                        %s%s%s%s%s%s%s%s
                        """.formatted((Object[]) UserSelections.values());

        System.out.print(options);
        System.out.print("Please make a selection:\n");

        try {
            var selection = redQueenInLoom.nextInt();
            switch (UserSelections.enumBySelection(selection)) {
                case ONE -> {
                    System.out.printf("selected %s\n", UserSelections.ONE);
                    selectionOne(redQueenInLoom);
                }
                case TWO -> {
                    System.out.printf("selected %s\n", UserSelections.TWO);
                    System.out.print("Please enter your email:\n");
                    var email = redQueenInLoom.next();
                    Entry newEntry = AddressBook2.findEntry(email);
                    System.out.println(AddressBook2.removeEntry(newEntry));
                    makeSelection(redQueenInLoom);
                }
                case THREE -> {
                    System.out.printf("selected %s\n", UserSelections.THREE);
                    System.out.print("Please enter an email:\n");
                    var email = redQueenInLoom.next();
                    Entry entry = AddressBook2.findEntry(email);
                    System.out.println(entry);
                    makeSelection(redQueenInLoom);
                }
                case FOUR -> {
                    System.out.printf("selected %s\n", UserSelections.FOUR);
                    AddressBook2.printAll();
                    redQueenInLoom.nextLine();
                    makeSelection(redQueenInLoom);
                }
                case FIVE -> {
                    System.out.printf("selected %s\n", UserSelections.FIVE);
                    System.out.print("Are you sure? Are you really really sure? (Y/n)\n");
                    var choice = redQueenInLoom.next();

                    if (choice.equalsIgnoreCase("y")) {
                        AddressBook2.removeAll();
                        redQueenInLoom.nextLine();
                        makeSelection(redQueenInLoom);
                    } else if (choice.equalsIgnoreCase("n")) {
                        redQueenInLoom.nextLine();
                        makeSelection(redQueenInLoom);
                    }

                }

                case SIX -> {
                    System.out.printf("selected %s\n", UserSelections.SIX);
                    System.out.println("Here is some music from the Loom tm game.\nClick on the Link below.\n");
                    System.out.println("https://www.youtube.com/watch?v=z5Wj5GOiJYg.");
                    makeSelection(redQueenInLoom);
                }
                case SEVEN -> {
                    System.out.printf("selected %s\n", UserSelections.SEVEN);
                    System.out.println("Adding the default names back into the address book...");
                    System.out.println("https://www.gog.com/game/loom?pp=35e995c107a71caeb833bb3b79f9f54781b33fa1\n");
                    System.out.println("https://www.gog.com/game/legend_of_kyrandia\n");
                    System.out.println("https://www.gog.com/game/kings_quest_4_5_6\n");
                    System.out.println("https://www.gog.com/game/the_curse_of_monkey_island\n");
                    System.out.println("These games aren't free but they are good and funny and nostalgic.\n");
                    makeSelection(redQueenInLoom);
                }
                case EIGHT -> {
                    System.out.println("You have been nowhere and everywhere. You've seen nothing and everything.");
                    exitSystem();
                }


                default -> throw new InputMismatchException();

            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.print("No no no no, try to turn the sheep green again!\n");
            redQueenInLoom.nextLine();
            makeSelection(redQueenInLoom);
        }
    }
}


