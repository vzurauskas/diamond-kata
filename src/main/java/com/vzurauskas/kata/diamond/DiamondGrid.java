package com.vzurauskas.kata.diamond;

public final class DiamondGrid implements Grid {

    private final Grid grid;
    private final Number size;

    public DiamondGrid(char letter, char background) {
        this.size = new AlphaNumber(letter).intValue() * 2 - 1;
        this.grid = new ArrayGrid(size, background);
    }

    public DiamondGrid(char letter) {
        this.size = new AlphaNumber(letter).intValue() * 2 - 1;
        this.grid = new ArrayGrid(size);
    }

    private Number size(char letter) {
        return size;
    }

    @Override
    public Grid set(int x, int y, char value) {
        return grid.set(x, y, value);
    }

    @Override
    public int size() {
        return grid.size();
    }

    @Override
    public Grid with(Diagonal diagonal) {
        return grid.with(diagonal);
    }

    @Override
    public String printed() {
        return grid.printed();
    }
}
