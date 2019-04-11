package com.vzurauskas.kata.diamond;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class ArrayGrid implements Grid {

    private final char[][] block;

    public ArrayGrid(List<String> rows) {
        this(rows.size());
        if (rows.size() != rows.get(0).length()) {
            throw new IllegalArgumentException("Not square.");
        }
        for (int i = 0; i < rows.size(); i++) {
            char[] array = block[i];
            char[] row = rows.get(i).toCharArray();
            System.arraycopy(row, 0, array, 0, row.length);
        }
    }

    public ArrayGrid(Number size) {
        this(size, ' ');
    }

    public ArrayGrid(Number size, char background) {
        this(init(size, background));
    }

    public ArrayGrid(ArrayGrid grid) {
        this(grid.block.clone());
    }

    private ArrayGrid(char[][] block) {
        this.block = block;
    }

    private static char[][] init(Number size, char background) {
        char[][] b = new char[size.intValue()][size.intValue()];
        for (int i = 0; i < size.intValue(); i++) {
            for (int j = 0; j < size.intValue(); j ++) {
                b[i][j] = background;
            }
        }
        return b;
    }

    @Override
    public Grid set(int x, int y, char value) {
        block[y][x] = value;
        return this;
    }

    @Override
    public int size() {
        return block.length;
    }

    @Override
    public Grid with(Diagonal diagonal) {
        Grid grid = new ArrayGrid(this);
        diagonal.printTo(grid);
        return grid;
    }

    @Override
    public String printed() {
        return Arrays.stream(block)
            .map(String::new)
            .collect(Collectors.joining("\n"));
    }
}
