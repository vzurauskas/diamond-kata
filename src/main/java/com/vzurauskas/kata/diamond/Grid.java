package com.vzurauskas.kata.diamond;

public interface Grid {
    Grid set(int x, int y, char value);
    int size();
    Grid with(Diagonal diagonal);
    String printed();
}
