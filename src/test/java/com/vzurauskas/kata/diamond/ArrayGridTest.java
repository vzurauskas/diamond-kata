package com.vzurauskas.kata.diamond;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

import org.junit.jupiter.api.Test;

final class ArrayGridTest {

    @Test
    void showsItselfAsString1() {
        assertEquals(
            "A",
            new ArrayGrid(
                Collections.singletonList("A")
            ).printed()
        );
    }
    @Test
    void showsItselfAsString2() {
        assertEquals(
            new StringJoiner("\n")
                .add("QEZA")
                .add("    ")
                .add("    ")
                .add("   P").toString(),
            new ArrayGrid(
                Arrays.asList(
                    "QEZA",
                    "    ",
                    "    ",
                    "   P"
                )
            ).printed()
        );
    }

    @Test
    void copes1() {
        assertEquals(
            new ArrayGrid(
                Arrays.asList(
                    "QEZA",
                    "    ",
                    "    ",
                    "   P"
                )
            ).printed(),
            new ArrayGrid(
                new ArrayGrid(
                    Arrays.asList(
                        "QEZA",
                        "    ",
                        "    ",
                        "   P"
                    )
                )
            ).printed()
        );
    }

    @Test
    void initsBackground() {
        assertEquals(
            new StringJoiner("\n")
                .add("xxx")
                .add("xxx")
                .add("xxx").toString(),
            new ArrayGrid(3, 'x').printed()
        );
    }

    @Test
    void setsLetter() {
        assertEquals(
            new StringJoiner("\n")
                .add("xxx")
                .add("xxV")
                .add("xxx").toString(),
            new ArrayGrid(3, 'x')
                .set(2, 1, 'V').printed()
        );
    }
}