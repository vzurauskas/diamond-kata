package com.vzurauskas.kata.diamond;

public final class VectorDiagonal implements Diagonal{

    private final char letter;
    private final Direction direction;
    private final int x;
    private final int y;

    public VectorDiagonal(char letter, Direction direction, int x, int y) {
        this.letter = letter;
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    @Override
    public void printTo(Grid grid) {
        int cx = x;
        int cy = y;
        for (char i = 'A'; i <= letter; i++) {
            grid.set(cx, cy, i);
            cx = direction.moveX(cx);
            cy = direction.moveY(cy);
        }
    }
}
