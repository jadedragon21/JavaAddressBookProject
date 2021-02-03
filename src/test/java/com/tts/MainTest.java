package com.tts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Entry testAddressBook2;
    Entry testEntry;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @BeforeEach
    void setUp() {

        testEntry = Entry.createEntry(
                "TestFirst",
                "TestLast",
                "TestPhone",
                "TestEmail");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void testMain() {
    }
}