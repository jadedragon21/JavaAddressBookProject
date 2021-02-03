package com.tts;

import java.util.stream.Stream;


    enum UserSelections {
        ONE (1, "Add an entry in the Loom"),
        TWO(2,"Remove an entry from the Loom"),
        THREE(3, "Search for a specified entry in the Loom"),
        FOUR(4, "Print Address Book to the Loom"),
        FIVE(5, "Delete the Book from the Loom"),
        SIX(6, "Loom Audio Drama Link"),
        SEVEN(7, "Links to Pay and Play"),
        EIGHT(8, "Quit");



        private final Integer i;
        private final String s;

        UserSelections(Integer i, String s) {
            this.i = i;
            this.s = s;
        }

        public Integer getI() {
            return i;
        }

        public String getS(){
            return s;
        }

        public static UserSelections enumBySelection(int i) {
            return Stream.of(UserSelections.values())
                    .filter(selections -> selections.getI().equals(i))
                    .findFirst()
                    .orElseThrow();
        }

        @Override
        public String toString() {
            return """
                 %d) %s...
                """.formatted(i, s);
        }
    }

