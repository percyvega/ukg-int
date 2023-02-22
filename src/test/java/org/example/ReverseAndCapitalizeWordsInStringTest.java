package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAndCapitalizeWordsInStringTest {

    @Test
    void reverseAndCapitalizeWordsInString() {
        String actual = ReverseAndCapitalizeWordsInString.reverseAndCapitalizeWordsInString("I saw desserts");

        assertEquals("I Was Stressed", actual);
    }
}