package com.vzurauskas.kata.diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class DiamondGridTest {
    @Test
    void aIsSize1() {
        assertEquals(
            1,
            new DiamondGrid('A').size()
        );
    }

    @Test
    void aIsSize3() {
        assertEquals(
            3,
            new DiamondGrid('B').size()
        );
    }
    @Test
    void aIsSize5() {
        assertEquals(
            5,
            new DiamondGrid('C').size()
        );
    }
}