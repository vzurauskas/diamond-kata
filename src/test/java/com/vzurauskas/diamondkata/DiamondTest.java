package com.vzurauskas.diamondkata;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

final class DiamondTest {

    @Test
    void printsA() {
        assertEquals(
            "A\n",
            new Full('A').printed()
        );
    }

    @Test
    void printsB() {
        assertEquals(
            " A\n" +
                "B B\n" +
                " A\n",
            new Full('B').printed()
        );
    }

    @Test
    void printsC() {
        assertEquals(
            "  A\n" +
                " B B\n" +
                "C   C\n" +
                " B B\n" +
                "  A\n",
            new Full(
                new ADiamond().larger().larger()
            ).printed()
        );
    }

    @Test
    void name() {
        System.out.println(
            new Full(
                new ADiamond().larger().larger().larger().larger().larger().larger().larger()
            ).printed()
        );
    }
}