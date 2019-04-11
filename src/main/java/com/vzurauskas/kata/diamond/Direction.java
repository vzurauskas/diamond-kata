package com.vzurauskas.kata.diamond;

public enum Direction {
    SOUTH_WEST(-1, 1),
    SOUTH_EAST(1, 1),
    NORTH_WEST(-1, -1),
    NORTH_EAST(1, -1);

    private final int x;
    private final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int moveX(int cx) {
        return cx + x;
    }

    public int moveY(int cy) {
        return cy + y;
    }
}
