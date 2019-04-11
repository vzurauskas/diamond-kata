package com.vzurauskas.kata.diamond;

public final class Diamond {

    private final char letter;
    private final Grid grid;

    public Diamond(char letter) {
        this.letter = letter;
        this.grid = new DiamondGrid(letter)
            .with(new VectorDiagonal(
                letter,
                Direction.SOUTH_WEST,
                new AlphaNumber(letter).intValue() - 1,
                0
            ))
            .with(new VectorDiagonal(
                letter,
                Direction.SOUTH_EAST,
                new AlphaNumber(letter).intValue() - 1,
                0
            ))
            .with(new VectorDiagonal(
                letter,
                Direction.NORTH_WEST,
                new AlphaNumber(letter).intValue() - 1,
                new AlphaNumber(letter).intValue() * 2 - 2
            ))
            .with(new VectorDiagonal(
                letter,
                Direction.NORTH_EAST,
                new AlphaNumber(letter).intValue() - 1,
                new AlphaNumber(letter).intValue() * 2 - 2
            ));
    }

    public String printed() {
        return grid.printed();
    }
}
