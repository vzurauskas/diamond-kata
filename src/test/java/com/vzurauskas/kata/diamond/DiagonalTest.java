package com.vzurauskas.kata.diamond;

import static org.junit.jupiter.api.Assertions.*;

import java.util.StringJoiner;

import org.junit.jupiter.api.Test;

final class DiagonalTest {

    @Test
    void printsA_SE_00() {
        assertEquals(
            new StringJoiner("\n")
                .add("A").toString(),
            new DiamondGrid('A').with(
                new VectorDiagonal('A', Direction.SOUTH_EAST, 0, 0)
            ).printed()
        );
    }

    @Test
    void printsB_SE_00() {
        assertEquals(
            new StringJoiner("\n")
                .add("Aoo")
                .add("oBo")
                .add("ooo")
                .toString(),
            new DiamondGrid('B', 'o').with(
                new VectorDiagonal('B', Direction.SOUTH_EAST, 0, 0)
            ).printed()
        );
    }

    @Test
    void printsC_SE_11() {
        assertEquals(
            new StringJoiner("\n")
                .add("ooooo")
                .add("oAooo")
                .add("ooBoo")
                .add("oooCo")
                .add("ooooo")
                .toString(),
            new DiamondGrid('C', 'o').with(
                new VectorDiagonal('C', Direction.SOUTH_EAST, 1, 1)
            ).printed()
        );
    }

    @Test
    void printsA_NE_00() {
        assertEquals(
            new StringJoiner("\n")
                .add("A").toString(),
            new DiamondGrid('A').with(
                new VectorDiagonal('A', Direction.SOUTH_EAST, 0, 0)
            ).printed()
        );
    }

    @Test
    void printsB_NE_01() {
        assertEquals(
            new StringJoiner("\n")
                .add("oBo")
                .add("Aoo")
                .add("ooo")
                .toString(),
            new DiamondGrid('B', 'o').with(
                new VectorDiagonal('B', Direction.NORTH_EAST, 0, 1)
            ).printed()
        );
    }

    @Test
    void printsC_SW_22() {
        assertEquals(
            new StringJoiner("\n")
                .add("ooooo")
                .add("ooooo")
                .add("ooAoo")
                .add("oBooo")
                .add("Coooo")
                .toString(),
            new DiamondGrid('C', 'o').with(
                new VectorDiagonal('C', Direction.SOUTH_WEST, 2, 2)
            ).printed()
        );
    }
}