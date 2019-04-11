package com.vzurauskas.kata.diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.StringJoiner;

import org.junit.jupiter.api.Test;

final class DiamondTest {

    @Test
    void printsA() {
        assertEquals(
            "A",
            new Diamond('A').printed()
        );
    }

    @Test
    void printsB() {
        assertEquals(
            new StringJoiner("\n")
            .add(" A ")
            .add("B B")
            .add(" A ").toString(),
            new Diamond('B').printed()
        );
    }

    @Test
    void printsC() {
        assertEquals(
            new StringJoiner("\n")
                .add("  A  ")
                .add(" B B ")
                .add("C   C")
                .add(" B B ")
                .add("  A  ")
                .toString(),
            new Diamond('C').printed()
        );
    }

    @Test
    void printZ() {
        System.out.println(new Diamond('Z').printed());
    }
}